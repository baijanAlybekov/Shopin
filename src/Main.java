public class Main {
    public static void main(String[] args) {
        Employee r1 = new Employee("adam", "spasatel");
        Employee r2 = new Employee("azamat", "meneger");
        Employee r3 = new Employee("amyr", "bankir");
        Employee r4 = new Employee("adil", "reportor");
        Employee r5 = new Employee("amanat", "stroitel");
        Employee r6 = new Employee("akyltay", "kloun");
        Employee r7 = new Employee("akmat", "director");
        Employee r8 = new Employee("almaz", "montajor");
        Employee r9 = new Employee("aktan", "doktor");
        Employee r10 = new Employee("argen", "tik-toker");
        Employee[] employees = {r1, r2, r3, r4, r5, r6, r7, r8, r9, r10};
        Employee ee = new Employee();



//
//        Shop sort =new Shop(employees,"face","faceNews","optovyi");
//        System.out.println(sort.toString());

            Shop shop = new Shop(employees, "AiAi", "Ai.ru", "optovyi");
            System.out.println("-------------------");
            System.out.println("-------Shop--------");
            System.out.println("|name|cait|cotrudniki|chtoProdaut|");
            System.out.println("|"+shop.getName() + "|" + shop.getNamesait() + "|  " + employees[0].getName1() + "   |" + shop.getTovar());
        System.out.println("     |     |  "+shop.getSotrudniki()[1].getName1()+"    |                   ");



    }
}
