package composite.company;

public class Client {
    public static void main(String[] args) {
        Employee developer = new IndividualEmployee("Chandan Kumar","Developer");
        Employee tester = new IndividualEmployee("Sagar Pawar","QA");
        Employee designer = new IndividualEmployee("Sangita","UI/UX");

        Department it = new Department("IT-Department****************");
        System.out.println();
        it.addEmployee(developer);
        it.addEmployee(tester);
        it.addEmployee(designer);

        Employee seniorHR = new IndividualEmployee("Soni","HR Head");
        Employee juniorHR = new IndividualEmployee("Loli","Junior HR");
        Employee associateHR = new IndividualEmployee("Poli","Intern HR");

        Department hr = new Department("HR-Department===========================");
        System.out.println();
        hr.addEmployee(seniorHR);
        hr.addEmployee(juniorHR);
        hr.addEmployee(associateHR);

        Department company = new Department("Company");
        company.addEmployee(it);
        company.addEmployee(hr);
        company.showDetails();



    }
}
