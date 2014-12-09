package android.support.v4.d;

import java.util.Collection;
import java.util.Iterator;

final class k
  implements Collection
{
  k(f paramf)
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
    return this.a.b(paramObject) >= 0;
  }

  public boolean containsAll(Collection paramCollection)
  {
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
      if (!contains(localIterator.next()))
        return false;
    return true;
  }

  public boolean isEmpty()
  {
    return this.a.a() == 0;
  }

  public Iterator iterator()
  {
    return new g(this.a, 1);
  }

  public boolean remove(Object paramObject)
  {
    int i = this.a.b(paramObject);
    if (i >= 0)
    {
      this.a.a(i);
      return true;
    }
    return false;
  }

  public boolean removeAll(Collection paramCollection)
  {
    int i = 0;
    int j = this.a.a();
    boolean bool = false;
    while (i < j)
    {
      if (paramCollection.contains(this.a.a(i, 1)))
      {
        this.a.a(i);
        i--;
        j--;
        bool = true;
      }
      i++;
    }
    return bool;
  }

  public boolean retainAll(Collection paramCollection)
  {
    int i = 0;
    int j = this.a.a();
    boolean bool = false;
    while (i < j)
    {
      if (!paramCollection.contains(this.a.a(i, 1)))
      {
        this.a.a(i);
        i--;
        j--;
        bool = true;
      }
      i++;
    }
    return bool;
  }

  public int size()
  {
    return this.a.a();
  }

  public Object[] toArray()
  {
    return this.a.b(1);
  }

  public Object[] toArray(Object[] paramArrayOfObject)
  {
    return this.a.a(paramArrayOfObject, 1);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.d.k
 * JD-Core Version:    0.6.2
 */