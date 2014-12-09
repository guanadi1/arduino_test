package android.support.v4.d;

import java.util.Map;

public class l
{
  static Object[] b;
  static int c;
  static Object[] d;
  static int e;
  int[] f = c.a;
  Object[] g = c.c;
  int h = 0;

  private static void a(int[] paramArrayOfInt, Object[] paramArrayOfObject, int paramInt)
  {
    if (paramArrayOfInt.length == 8)
      try
      {
        if (e < 10)
        {
          paramArrayOfObject[0] = d;
          paramArrayOfObject[1] = paramArrayOfInt;
          for (int j = -1 + (paramInt << 1); j >= 2; j--)
            paramArrayOfObject[j] = null;
          d = paramArrayOfObject;
          e = 1 + e;
        }
        return;
      }
      finally
      {
      }
    if (paramArrayOfInt.length == 4)
      try
      {
        if (c < 10)
        {
          paramArrayOfObject[0] = b;
          paramArrayOfObject[1] = paramArrayOfInt;
          for (int i = -1 + (paramInt << 1); i >= 2; i--)
            paramArrayOfObject[i] = null;
          b = paramArrayOfObject;
          c = 1 + c;
        }
        return;
      }
      finally
      {
      }
  }

  private void e(int paramInt)
  {
    if (paramInt == 8);
    while (true)
    {
      try
      {
        if (d != null)
        {
          Object[] arrayOfObject2 = d;
          this.g = arrayOfObject2;
          d = (Object[])arrayOfObject2[0];
          this.f = ((int[])arrayOfObject2[1]);
          arrayOfObject2[1] = null;
          arrayOfObject2[0] = null;
          e = -1 + e;
          return;
        }
        this.f = new int[paramInt];
        this.g = new Object[paramInt << 1];
        return;
      }
      finally
      {
      }
      if (paramInt == 4)
        try
        {
          if (b != null)
          {
            Object[] arrayOfObject1 = b;
            this.g = arrayOfObject1;
            b = (Object[])arrayOfObject1[0];
            this.f = ((int[])arrayOfObject1[1]);
            arrayOfObject1[1] = null;
            arrayOfObject1[0] = null;
            c = -1 + c;
            return;
          }
        }
        finally
        {
        }
    }
  }

  int a()
  {
    int i = this.h;
    int j;
    if (i == 0)
      j = -1;
    do
    {
      return j;
      j = c.a(this.f, i, 0);
    }
    while ((j < 0) || (this.g[(j << 1)] == null));
    for (int k = j + 1; (k < i) && (this.f[k] == 0); k++)
      if (this.g[(k << 1)] == null)
        return k;
    j--;
    while (true)
    {
      if ((j < 0) || (this.f[j] != 0))
        break label108;
      if (this.g[(j << 1)] == null)
        break;
      j--;
    }
    label108: return k ^ 0xFFFFFFFF;
  }

  int a(Object paramObject)
  {
    int i = 1;
    int j = 2 * this.h;
    Object[] arrayOfObject = this.g;
    if (paramObject == null)
      while (i < j)
      {
        if (arrayOfObject[i] == null)
          return i >> 1;
        i += 2;
      }
    do
    {
      i += 2;
      if (i >= j)
        break;
    }
    while (!paramObject.equals(arrayOfObject[i]));
    return i >> 1;
    return -1;
  }

  int a(Object paramObject, int paramInt)
  {
    int i = this.h;
    int j;
    if (i == 0)
      j = -1;
    do
    {
      return j;
      j = c.a(this.f, i, paramInt);
    }
    while ((j < 0) || (paramObject.equals(this.g[(j << 1)])));
    for (int k = j + 1; (k < i) && (this.f[k] == paramInt); k++)
      if (paramObject.equals(this.g[(k << 1)]))
        return k;
    j--;
    while (true)
    {
      if ((j < 0) || (this.f[j] != paramInt))
        break label136;
      if (paramObject.equals(this.g[(j << 1)]))
        break;
      j--;
    }
    label136: return k ^ 0xFFFFFFFF;
  }

  public Object a(int paramInt, Object paramObject)
  {
    int i = 1 + (paramInt << 1);
    Object localObject = this.g[i];
    this.g[i] = paramObject;
    return localObject;
  }

  public void a(int paramInt)
  {
    if (this.f.length < paramInt)
    {
      int[] arrayOfInt = this.f;
      Object[] arrayOfObject = this.g;
      e(paramInt);
      if (this.h > 0)
      {
        System.arraycopy(arrayOfInt, 0, this.f, 0, this.h);
        System.arraycopy(arrayOfObject, 0, this.g, 0, this.h << 1);
      }
      a(arrayOfInt, arrayOfObject, this.h);
    }
  }

  public Object b(int paramInt)
  {
    return this.g[(paramInt << 1)];
  }

  public Object c(int paramInt)
  {
    return this.g[(1 + (paramInt << 1))];
  }

  public void clear()
  {
    if (this.h != 0)
    {
      a(this.f, this.g, this.h);
      this.f = c.a;
      this.g = c.c;
      this.h = 0;
    }
  }

  public boolean containsKey(Object paramObject)
  {
    if (paramObject == null)
      if (a() < 0);
    while (a(paramObject, paramObject.hashCode()) >= 0)
    {
      return true;
      return false;
    }
    return false;
  }

  public boolean containsValue(Object paramObject)
  {
    return a(paramObject) >= 0;
  }

  public Object d(int paramInt)
  {
    int i = 8;
    Object localObject = this.g[(1 + (paramInt << 1))];
    if (this.h <= 1)
    {
      a(this.f, this.g, this.h);
      this.f = c.a;
      this.g = c.c;
      this.h = 0;
    }
    int[] arrayOfInt;
    Object[] arrayOfObject;
    do
    {
      return localObject;
      if ((this.f.length <= i) || (this.h >= this.f.length / 3))
        break;
      if (this.h > i)
        i = this.h + (this.h >> 1);
      arrayOfInt = this.f;
      arrayOfObject = this.g;
      e(i);
      this.h = (-1 + this.h);
      if (paramInt > 0)
      {
        System.arraycopy(arrayOfInt, 0, this.f, 0, paramInt);
        System.arraycopy(arrayOfObject, 0, this.g, 0, paramInt << 1);
      }
    }
    while (paramInt >= this.h);
    System.arraycopy(arrayOfInt, paramInt + 1, this.f, paramInt, this.h - paramInt);
    System.arraycopy(arrayOfObject, paramInt + 1 << 1, this.g, paramInt << 1, this.h - paramInt << 1);
    return localObject;
    this.h = (-1 + this.h);
    if (paramInt < this.h)
    {
      System.arraycopy(this.f, paramInt + 1, this.f, paramInt, this.h - paramInt);
      System.arraycopy(this.g, paramInt + 1 << 1, this.g, paramInt << 1, this.h - paramInt << 1);
    }
    this.g[(this.h << 1)] = null;
    this.g[(1 + (this.h << 1))] = null;
    return localObject;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject);
    while (true)
    {
      return true;
      if ((paramObject instanceof Map))
      {
        Map localMap = (Map)paramObject;
        if (size() != localMap.size())
          return false;
        int i = 0;
        try
        {
          while (i < this.h)
          {
            Object localObject1 = b(i);
            Object localObject2 = c(i);
            Object localObject3 = localMap.get(localObject1);
            if (localObject2 == null)
            {
              if (localObject3 != null)
                break label124;
              if (!localMap.containsKey(localObject1))
                break label124;
            }
            else
            {
              boolean bool = localObject2.equals(localObject3);
              if (!bool)
                return false;
            }
            i++;
          }
        }
        catch (NullPointerException localNullPointerException)
        {
          return false;
        }
        catch (ClassCastException localClassCastException)
        {
          return false;
        }
      }
    }
    return false;
    label124: return false;
  }

  public Object get(Object paramObject)
  {
    if (paramObject == null);
    for (int i = a(); i >= 0; i = a(paramObject, paramObject.hashCode()))
      return this.g[(1 + (i << 1))];
    return null;
  }

  public int hashCode()
  {
    int[] arrayOfInt = this.f;
    Object[] arrayOfObject = this.g;
    int i = this.h;
    int j = 1;
    int k = 0;
    int m = 0;
    if (k < i)
    {
      Object localObject = arrayOfObject[j];
      int n = arrayOfInt[k];
      if (localObject == null);
      for (int i1 = 0; ; i1 = localObject.hashCode())
      {
        m += (i1 ^ n);
        k++;
        j += 2;
        break;
      }
    }
    return m;
  }

  public boolean isEmpty()
  {
    return this.h <= 0;
  }

  public Object put(Object paramObject1, Object paramObject2)
  {
    int i = 8;
    int k;
    int j;
    if (paramObject1 == null)
    {
      k = a();
      j = 0;
    }
    while (k >= 0)
    {
      int n = 1 + (k << 1);
      Object localObject = this.g[n];
      this.g[n] = paramObject2;
      return localObject;
      j = paramObject1.hashCode();
      k = a(paramObject1, j);
    }
    int m = k ^ 0xFFFFFFFF;
    if (this.h >= this.f.length)
    {
      if (this.h < i)
        break label275;
      i = this.h + (this.h >> 1);
    }
    while (true)
    {
      int[] arrayOfInt = this.f;
      Object[] arrayOfObject = this.g;
      e(i);
      if (this.f.length > 0)
      {
        System.arraycopy(arrayOfInt, 0, this.f, 0, arrayOfInt.length);
        System.arraycopy(arrayOfObject, 0, this.g, 0, arrayOfObject.length);
      }
      a(arrayOfInt, arrayOfObject, this.h);
      if (m < this.h)
      {
        System.arraycopy(this.f, m, this.f, m + 1, this.h - m);
        System.arraycopy(this.g, m << 1, this.g, m + 1 << 1, this.h - m << 1);
      }
      this.f[m] = j;
      this.g[(m << 1)] = paramObject1;
      this.g[(1 + (m << 1))] = paramObject2;
      this.h = (1 + this.h);
      return null;
      label275: if (this.h < 4)
        i = 4;
    }
  }

  public Object remove(Object paramObject)
  {
    if (paramObject == null);
    for (int i = a(); i >= 0; i = a(paramObject, paramObject.hashCode()))
      return d(i);
    return null;
  }

  public int size()
  {
    return this.h;
  }

  public String toString()
  {
    if (isEmpty())
      return "{}";
    StringBuilder localStringBuilder = new StringBuilder(28 * this.h);
    localStringBuilder.append('{');
    int i = 0;
    if (i < this.h)
    {
      if (i > 0)
        localStringBuilder.append(", ");
      Object localObject1 = b(i);
      if (localObject1 != this)
      {
        localStringBuilder.append(localObject1);
        label73: localStringBuilder.append('=');
        Object localObject2 = c(i);
        if (localObject2 == this)
          break label116;
        localStringBuilder.append(localObject2);
      }
      while (true)
      {
        i++;
        break;
        localStringBuilder.append("(this Map)");
        break label73;
        label116: localStringBuilder.append("(this Map)");
      }
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.d.l
 * JD-Core Version:    0.6.2
 */