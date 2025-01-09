package coderpad;

public class StringJoin {

    public static String joinStr(String[] words){
        StringBuilder sb = new StringBuilder();

        for(String str : words){
            sb.append(str).append(" ");
        }

        String res = sb.toString().trim();
        return  res;
    }

    public static void main(String[] args) {
        String[] arr = {"Java", "is", "Fun"};
        String res = joinStr(arr);
        System.out.println(res);
    }
}
