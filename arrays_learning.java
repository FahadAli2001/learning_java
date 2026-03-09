public class arrays_learning {
     public static void main(String[] args) throws Exception {
        int [] marks = new int[5];

        for (int i = 0; i < marks.length; i++) {
            marks[i] = i+1;
            System.out.println(marks[i]);
        }
    }
}
