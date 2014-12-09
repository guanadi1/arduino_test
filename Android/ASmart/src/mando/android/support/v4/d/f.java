package android.support.v4.d;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

abstract class f
{
  h b;
  i c;
  k d;

  public static boolean a(Map paramMap, Collection paramCollection)
  {
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
      if (!paramMap.containsKey(localIterator.next()))
        return false;
    return true;
  }

  public static boolean a(Set paramSet, Object paramObject)
  {
    boolean bool1 = true;
    boolean bool3;
    if (paramSet == paramObject)
      bool3 = bool1;
    boolean bool2;
    do
    {
      return bool3;
      bool2 = paramObject instanceof Set;
      bool3 = false;
    }
    while (!bool2);
    Set localSet = (Set)paramObject;
    try
    {
      if (paramSet.size() == localSet.size())
      {
        boolean bool4 = paramSet.containsAll(localSet);
        if (!bool4);
      }
      while (true)
      {
        return bool1;
        bool1 = false;
      }
    }
    catch (ClassCastException localClassCastException)
    {
      return false;
    }
    catch (NullPointerException localNullPointerException)
    {
    }
    return false;
  }

  public static boolean b(Map paramMap, Collection paramCollection)
  {
    int i = paramMap.size();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
      paramMap.remove(localIterator.next());
    return i != paramMap.size();
  }

  public static boolean c(Map paramMap, Collection paramCollection)
  {
    int i = paramMap.size();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
      if (!paramCollection.contains(localIterator.next()))
        localIterator.remove();
    return i != paramMap.size();
  }

  protected abstract int a();

  protected abstract int a(Object paramObject);

  protected abstract Object a(int paramInt1, int paramInt2);

  protected abstract Object a(int paramInt, Object paramObject);

  protected abstract void a(int paramInt);

  protected abstract void a(Object paramObject1, Object paramObject2);

  public Object[] a(Object[] paramArrayOfObject, int paramInt)
  {
    int i = a();
    if (paramArrayOfObject.length < i);
    for (Object[] arrayOfObject = (Object[])Array.newInstance(paramArrayOfObject.getClass().getComponentType(), i); ; arrayOfObject = paramArrayOfObject)
    {
      for (int j = 0; j < i; j++)
        arrayOfObject[j] = a(j, paramInt);
      if (arrayOfObject.length > i)
        arrayOfObject[i] = null;
      return arrayOfObject;
    }
  }

  protected abstract int b(Object paramObject);

  protected abstract Map b();

  public Object[] b(int paramInt)
  {
    int i = a();
    Object[] arrayOfObject = new Object[i];
    for (int j = 0; j < i; j++)
      arrayOfObject[j] = a(j, paramInt);
    return arrayOfObject;
  }

  protected abstract void c();

  public Set d()
  {
    if (this.b == null)
      this.b = new h(this);
    return this.b;
  }

  public Set e()
  {
    if (this.c == null)
      this.c = new i(this);
    return this.c;
  }

  public Collection f()
  {
    if (this.d == null)
      this.d = new k(this);
    return this.d;
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.d.f
 * JD-Core Version:    0.6.2
 */