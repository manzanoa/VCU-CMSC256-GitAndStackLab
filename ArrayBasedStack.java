import java.util.Arrays;
public class ArrayBasedStack<T> implements StackInterface<T>
{
   
   final int INITIAL_CAPACITY;
   int topOfStack = 0;
   boolean initiallized = false;
   T[] data;
   
   public ArrayBasedStack(int i)
   {
      if (i < 0)
      {
         throw new IllegalArgumentException("Stack cannot be negative.");
      }  
      topOfStack = -1;
      INITIAL_CAPACITY = i;
      data = (T[]) new Object[INITIAL_CAPACITY];

      
   }
   
   public ArrayBasedStack()
   {
      INITIAL_CAPACITY = 5;
      data = (T[]) new Object[INITIAL_CAPACITY];

   }
   
   private T[] doubleArraySize(T[] data1)
   {
      T[] copy = Arrays.copyOf(data1,(data1.length*2));
      return copy;
   }
   
   public void push(T newEntry)
   {
      
   }

   public T pop()
   {
         
   }

   public T peek()
   {
   
   }
   
   public boolean isEmpty()
   {
      
      if (data[0] != null)
      {
         return false;
      }
      else
      {
         return true;
      }
   }

   public void clear()
   {
      
   }
}