package android.support.v4.d;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class a extends l
  implements Map
{
  f a;

  private f b()
  {
    if (this.a == null)
      this.a = new b(this);
    return this.a;
  }

  public Set entrySet()
  {
    return b().d();
  }

  public Set keySet()
  {
    return b().e();
  }

  public void putAll(Map paramMap)
  {
    a(this.h + paramMap.size());
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      put(localEntry.getKey(), localEntry.getValue());
    }
  }

  public Collection values()
  {
    return b().f();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.d.a
 * JD-Core Version:    0.6.2
 */