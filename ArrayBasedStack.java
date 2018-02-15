public class ArrayBasedStack<T> implements StackInterface<T>
{
   final int INITIAL_CAPACITY = 5;
   int topOfStack = 0;
   T[] data = (T[]) new Object[INITIAL_CAPACITY];
   boolean initiallized = false;
   
   public ArrayBasedStack(int i)
   {
      if (i < 0)
      {
         throw new IllegalArgumentException("Stack cannot be negative.");
      }  
      
   }
   

   
}