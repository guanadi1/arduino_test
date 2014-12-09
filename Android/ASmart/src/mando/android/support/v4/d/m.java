package android.support.v4.d;

public class m
  implements Cloneable
{
  private static final Object a = new Object();
  private boolean b = false;
  private int[] c;
  private Object[] d;
  private int e;

  public m()
  {
    this(10);
  }

  public m(int paramInt)
  {
    if (paramInt == 0)
      this.c = c.a;
    int i;
    for (this.d = c.c; ; this.d = new Object[i])
    {
      this.e = 0;
      return;
      i = c.a(paramInt);
      this.c = new int[i];
    }
  }

  private void d()
  {
    int i = this.e;
    int[] arrayOfInt = this.c;
    Object[] arrayOfObject = this.d;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      Object localObject = arrayOfObject[j];
      if (localObject != a)
      {
        if (j != k)
        {
          arrayOfInt[k] = arrayOfInt[j];
          arrayOfObject[k] = localObject;
          arrayOfObject[j] = null;
        }
        k++;
      }
      j++;
    }
    this.b = false;
    this.e = k;
  }

  public int a(int paramInt)
  {
    if (this.b)
      d();
    return this.c[paramInt];
  }

  // ERROR //
  public m a()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 52	java/lang/Object:clone	()Ljava/lang/Object;
    //   4: checkcast 2	android/support/v4/d/m
    //   7: astore_2
    //   8: aload_2
    //   9: aload_0
    //   10: getfield 34	android/support/v4/d/m:c	[I
    //   13: invokevirtual 54	[I:clone	()Ljava/lang/Object;
    //   16: checkcast 53	[I
    //   19: putfield 34	android/support/v4/d/m:c	[I
    //   22: aload_2
    //   23: aload_0
    //   24: getfield 38	android/support/v4/d/m:d	[Ljava/lang/Object;
    //   27: invokevirtual 56	[Ljava/lang/Object;:clone	()Ljava/lang/Object;
    //   30: checkcast 55	[Ljava/lang/Object;
    //   33: putfield 38	android/support/v4/d/m:d	[Ljava/lang/Object;
    //   36: aload_2
    //   37: areturn
    //   38: astore_1
    //   39: aconst_null
    //   40: areturn
    //   41: astore_3
    //   42: aload_2
    //   43: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   0	8	38	java/lang/CloneNotSupportedException
    //   8	36	41	java/lang/CloneNotSupportedException
  }

  public int b()
  {
    if (this.b)
      d();
    return this.e;
  }

  public Object b(int paramInt)
  {
    if (this.b)
      d();
    return this.d[paramInt];
  }

  public void c()
  {
    int i = this.e;
    Object[] arrayOfObject = this.d;
    for (int j = 0; j < i; j++)
      arrayOfObject[j] = null;
    this.e = 0;
    this.b = false;
  }

  public String toString()
  {
    if (b() <= 0)
      return "{}";
    StringBuilder localStringBuilder = new StringBuilder(28 * this.e);
    localStringBuilder.append('{');
    int i = 0;
    if (i < this.e)
    {
      if (i > 0)
        localStringBuilder.append(", ");
      localStringBuilder.append(a(i));
      localStringBuilder.append('=');
      Object localObject = b(i);
      if (localObject != this)
        localStringBuilder.append(localObject);
      while (true)
      {
        i++;
        break;
        localStringBuilder.append("(this Map)");
      }
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.d.m
 * JD-Core Version:    0.6.2
 */