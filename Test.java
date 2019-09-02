import java.util.* ;

public class Test  {
     public static void main(String[] args) {
            List<Integer> ints = Arrays.asList(1,2,3);
            int s = 0;
            for (int n : ints) { s += n; }
              assert s == 6; 
             System.out.println(s);
             int sum = ints.stream()
              .mapToInt( i -> i)
              .sum();
              System.out.println("sum : " + sum);

       
     }
}
