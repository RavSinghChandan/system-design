package cor.chandan;

public class Client {
    public static void main(String[] args) {
        // Create handlers
        RequestHandler palmReadingHandler = new PalmReadingHandler();
        RequestHandler vastuConsultancyHandler = new VastuConsultancyHandler();
        RequestHandler farmingHandler = new FarmingHandler();

        // Set up the chain
        palmReadingHandler.setNextHandler(vastuConsultancyHandler);
        vastuConsultancyHandler.setNextHandler(farmingHandler);

        // Client requests
        System.out.println("Client: Requesting Palm Reading");
        palmReadingHandler.handleRequest("Palm Reading");

        System.out.println("\nClient: Requesting Vastu Consultancy");
        palmReadingHandler.handleRequest("Vastu Consultancy");

        System.out.println("\nClient: Requesting Farming");
        palmReadingHandler.handleRequest("Farming");

        System.out.println("\nClient: Requesting Cooking Advice");
        palmReadingHandler.handleRequest("Cooking Advice");
    }
}
