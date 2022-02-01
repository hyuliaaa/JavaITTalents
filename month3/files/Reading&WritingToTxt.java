public class Demo {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Helllo, it me");
        strings.add("Baby, I am was");
        strings.add("Hello world");

        try (PrintWriter printWriter = new PrintWriter("proba.txt")) { //ако няма файл с това име го създава
            //винаги в try with resources, защото, ако няма close не записва.
            for (String s : strings) {
                printWriter.println(s);
            }
        } catch (FileNotFoundException e) {
            //
        }


        File f = new File("proba.txt"); //ако файла вече съществува създава референция към него


        try {
            Scanner scanner = new Scanner(f);
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
