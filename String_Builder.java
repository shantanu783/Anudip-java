public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Shantanu");
        
        System.out.println(sb);
        System.out.println(sb.charAt(1));

        sb.setCharAt(0, 'a');
        System.out.println(sb);

        sb.delete(0, 2);
        System.out.println("Delete:"+sb);

        sb.insert(0, 's');
        System.out.println(sb);

        sb.append('J');
        System.out.println(sb);

        
    }
}
