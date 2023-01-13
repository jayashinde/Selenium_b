package LogicalProgram;

import org.junit.*;

public class Assignment3
{

  @BeforeClass
 public static  void beforeClass(){
      System.out.println("start");
  }
  @Test
  public void hiDemo(){
      System.out.println("Hii");
  }
  @AfterClass
  public static void AfterClass(){
      System.out.println("End");
  }
  @Before
    public void beforeDmoe(){
      System.out.println("start.......");
  }
   @Test
    public void hello(){
       System.out.println("Hello......");
       Assert.assertEquals("hi","hello");
   }

   @After
    public void afterDemo(){
       System.out.println("end.....");
   }

}
