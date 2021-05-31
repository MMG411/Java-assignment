
package Day3;




import com.sun.xml.internal.ws.util.StringUtils;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Exersice2 { 
    


      public static String betterString(String s1,String s2,BiPredicate<String, String> bp)
     {
     boolean flag = bp.test(s1, s2);
      if (flag==true)
         return s1;
      
      else
          return s2;
     }
   
    
    
}
