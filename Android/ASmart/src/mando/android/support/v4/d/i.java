package android.support.v4.d;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

final class i
  implements Set
{
  i(f paramf)
  {
  }

  public boolean add(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }

  public boolean addAll(Collection paramCollection)
  {
    throw new UnsupportedOperationException();
  }

  public void clear()
  {
    this.a.c();
  }

  public boolean contains(Object paramObject)
  {
    return this.a.a(paramObject) >= 0;
  }

  public boolean containsAll(Collection paramCollection)
  {
    return f.a(this.a.b(), paramCollection);
  }

  public boolean equals(Object paramObject)
  {
    return f.a(this, paramObject);
  }

  public int hashCode()
  {
    int i = -1 + this.a.a();
    int j = 0;
    if (i >= 0)
    {
      Object localObject = this.a.a(i, 0);
      if (localObject == null);
      for (int k = 0; ; k = localObject.hashCode())
      {
        j += k;
        i--;
        break;
      }
    }
    return j;
  }

  public boolean isEmpty()
  {
    return this.a.a() == 0;
  }

  public Iterator iterator()
  {
    return new g(this.a, 0);
  }

  public boolean remove(Object paramObject)
  {
    int i = this.a.a(paramObject);
    if (i >= 0)
    {
      this.a.a(i);
      return true;
    }
    return false;
  }

  public boolean removeAll(Collection paramCollection)
  {
    return f.b(this.a.b(), paramCollection);
  }

  public boolean retainAll(Collection paramCollection)
  {
    return f.c(this.a.b(), paramCollection);
  }

  public int size()
  {
    return this.a.a();
  }

  public Object[] toArray()
  {
    return this.a.b(0);
  }

  public Object[] toArray(Object[] paramArrayOfObject)
  {
    return this.a.a(paramArrayOfObject, 0);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.d.i
 * JD-Core Version:    0.6.2
 */