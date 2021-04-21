public class Main {

    public static void main(String[] args) {

        /*String ogrenci1 ="Kader";
        System.out.println(ogrenci1);
        String[] students=new String[2];
        students [0]="Kader";
        students [1]="Ali";
        for (int i=0;i<students.length;i++)
        {
            System.out.println(students[i]);
        }
        System.out.println("********************");
        for (String student:students)
        {
            System.out.println(student);
        }*/
        // ************DEMO*****************
        double[] mylist = {1.2, 2.1, 3.5, 9.01, 4.5};
        double total = 0;
        double max = mylist[0];
        for (double num : mylist) {
            if (num > max) {
                max = num;

            }
            total = total + num;

        }
        System.out.println(max);
        System.out.println(total);

    }
}
