package android.support.v4.d;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

final class h
  implements Set
{
  h(f paramf)
  {
  }

  public boolean a(Map.Entry paramEntry)
  {
    throw new UnsupportedOperationException();
  }

  public boolean addAll(Collection paramCollection)
  {
    int i = this.a.a();
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      this.a.a(localEntry.getKey(), localEntry.getValue());
    }
    return i != this.a.a();
  }

  public void clear()
  {
    this.a.c();
  }

  public boolean contains(Object paramObject)
  {
    if (!(paramObject instanceof Map.Entry));
    Map.Entry localEntry;
    int i;
    do
    {
      return false;
      localEntry = (Map.Entry)paramObject;
      i = this.a.a(localEntry.getKey());
    }
    while (i < 0);
    return c.a(this.a.a(i, 1), localEntry.getValue());
  }

  public boolean containsAll(Collection paramCollection)
  {
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
      if (!contains(localIterator.next()))
        return false;
    return true;
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
      Object localObject1 = this.a.a(i, 0);
      Object localObject2 = this.a.a(i, 1);
      int k;
      if (localObject1 == null)
      {
        k = 0;
        label44: if (localObject2 != null)
          break label79;
      }
      label79: for (int m = 0; ; m = localObject2.hashCode())
      {
        int n = j + (m ^ k);
        i--;
        j = n;
        break;
        k = localObject1.hashCode();
        break label44;
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
    return new j(this.a);
  }

  public boolean remove(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }

  public boolean removeAll(Collection paramCollection)
  {
    throw new UnsupportedOperationException();
  }

  public boolean retainAll(Collection paramCollection)
  {
    throw new UnsupportedOperationException();
  }

  public int size()
  {
    return this.a.a();
  }

  public Object[] toArray()
  {
    throw new UnsupportedOperationException();
  }

  public Object[] toArray(Object[] paramArrayOfObject)
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.d.h
 * JD-Core Version:    0.6.2
 */