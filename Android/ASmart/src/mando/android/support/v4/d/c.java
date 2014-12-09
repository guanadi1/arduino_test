package android.support.v4.d;

class c
{
  static final int[] a = new int[0];
  static final long[] b = new long[0];
  static final Object[] c = new Object[0];

  public static int a(int paramInt)
  {
    return b(paramInt * 4) / 4;
  }

  static int a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = paramInt1 - 1;
    while (i <= j)
    {
      int k = i + j >>> 1;
      int m = paramArrayOfInt[k];
      if (m < paramInt2)
        i = k + 1;
      else if (m > paramInt2)
        j = k - 1;
      else
        return k;
    }
    return i ^ 0xFFFFFFFF;
  }

  public static boolean a(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }

  public static int b(int paramInt)
  {
    for (int i = 4; ; i++)
      if (i < 32)
      {
        if (paramInt <= -12 + (1 << i))
          paramInt = -12 + (1 << i);
      }
      else
        return paramInt;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.d.c
 * JD-Core Version:    0.6.2
 */