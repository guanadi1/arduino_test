package android.support.v4.d;

import java.util.Iterator;
import java.util.Map.Entry;

final class j
  implements Iterator, Map.Entry
{
  int a;
  int b;
  boolean c = false;

  j(f paramf)
  {
    this.a = (-1 + paramf.a());
    this.b = -1;
  }

  public Map.Entry a()
  {
    this.b = (1 + this.b);
    this.c = true;
    return this;
  }

  public final boolean equals(Object paramObject)
  {
    int i = 1;
    if (!this.c)
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    if (!(paramObject instanceof Map.Entry))
      return false;
    Map.Entry localEntry = (Map.Entry)paramObject;
    if ((c.a(localEntry.getKey(), this.d.a(this.b, 0))) && (c.a(localEntry.getValue(), this.d.a(this.b, i))));
    while (true)
    {
      return i;
      int j = 0;
    }
  }

  public Object getKey()
  {
    if (!this.c)
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    return this.d.a(this.b, 0);
  }

  public Object getValue()
  {
    if (!this.c)
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    return this.d.a(this.b, 1);
  }

  public boolean hasNext()
  {
    return this.b < this.a;
  }

  public final int hashCode()
  {
    if (!this.c)
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    Object localObject1 = this.d.a(this.b, 0);
    Object localObject2 = this.d.a(this.b, 1);
    int i;
    int j;
    if (localObject1 == null)
    {
      i = 0;
      j = 0;
      if (localObject2 != null)
        break label69;
    }
    while (true)
    {
      return j ^ i;
      i = localObject1.hashCode();
      break;
      label69: j = localObject2.hashCode();
    }
  }

  public void remove()
  {
    if (!this.c)
      throw new IllegalStateException();
    this.d.a(this.b);
    this.b = (-1 + this.b);
    this.a = (-1 + this.a);
    this.c = false;
  }

  public Object setValue(Object paramObject)
  {
    if (!this.c)
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    return this.d.a(this.b, paramObject);
  }

  public final String toString()
  {
    return getKey() + "=" + getValue();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.d.j
 * JD-Core Version:    0.6.2
 */