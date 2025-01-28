package realtime.collab;

import realtime.collab.accesscontrol.AccessControlService;
import realtime.collab.accesscontrol.PermissionsDecorator;
import realtime.collab.collaboration.CollaborationService;
import realtime.collab.collaboration.SyncChangesCommand;
import realtime.collab.document.Document;
import realtime.collab.document.DocumentService;
import realtime.collab.document.DocumentState;
import realtime.collab.document.VersionControlService;
import realtime.collab.notification.NotificationFacade;
import realtime.collab.user.UserService;
import realtime.collab.versioning.DifferentialStrategy;
import realtime.collab.versioning.FullSnapshotStrategy;
import realtime.collab.versioning.VersionStrategy;

public class Client {
    public static void main(String[] args) {

        // User Setup
        UserService userService = new UserService();
        userService.addUser("ADMIN", "Amit Sharma", "amit.sharma@example.com");
        userService.addUser("EDITOR", "Priya Reddy", "priya.reddy@example.com");
        userService.addUser("VIEWER", "Ravi Kumar", "ravi.kumar@example.com");

        // Displaying user roles
        System.out.println("User: " + userService.getUser("amit.sharma@example.com").getRole());
        System.out.println("User: " + userService.getUser("priya.reddy@example.com").getRole());
        System.out.println("User: " + userService.getUser("ravi.kumar@example.com").getRole());

        // Document creation
        DocumentService documentService = new DocumentService();
        Document document = documentService.createDocument("Project Plan", "This is the content of the project plan.");
        System.out.println("Document created: " + document.getTitle());

        // Version Control
        VersionControlService versionControlService = new VersionControlService();
        DocumentState docState = new DocumentState(document.getContent());
        versionControlService.saveVersion(docState);
        System.out.println("Saved version: " + versionControlService.getVersion(0).getContent());

        // Collaboration session
        CollaborationService collaborationService = new CollaborationService();
        collaborationService.startSession(1); // Example document ID

        // Sync changes command
        SyncChangesCommand syncChanges = new SyncChangesCommand();
        syncChanges.execute("Updated content for the document.");

        // Notifications
        NotificationFacade notificationFacade = new NotificationFacade();
        notificationFacade.notifyAll("Document has been updated!");

        // Access control and permissions
        AccessControlService accessControlService = new AccessControlService();
        boolean hasAccess = accessControlService.checkAccess("ADMIN", "edit");
        System.out.println("Admin has access to edit: " + hasAccess);

        // Versioning strategy (Full Snapshot)
        VersionStrategy fullSnapshotStrategy = new FullSnapshotStrategy();
        fullSnapshotStrategy.saveVersion("Full snapshot of document content");

        // Versioning strategy (Differential)
        VersionStrategy differentialStrategy = new DifferentialStrategy();
        differentialStrategy.saveVersion("Differential snapshot of document content");

        // Add permissions
        PermissionsDecorator permissionsDecorator = new PermissionsDecorator();
        permissionsDecorator.addPermission("ADMIN", "delete");

    }
}
