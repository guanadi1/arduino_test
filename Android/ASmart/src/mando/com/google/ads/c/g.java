package com.google.ads.c;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class g
{
  protected void a()
  {
  }

  public void a(Map paramMap)
  {
    HashMap localHashMap = new HashMap();
    for (Field localField3 : getClass().getFields())
    {
      i locali = (i)localField3.getAnnotation(i.class);
      if (locali != null)
        localHashMap.put(locali.a(), localField3);
    }
    if (localHashMap.isEmpty())
      com.google.ads.e.i.e("No server options fields detected.  To suppress this message either add a field with the @Parameter annotation, or override the load() method");
    Iterator localIterator1 = paramMap.entrySet().iterator();
    while (localIterator1.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator1.next();
      Field localField2 = (Field)localHashMap.remove(localEntry.getKey());
      if (localField2 != null)
        try
        {
          localField2.set(this, localEntry.getValue());
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          com.google.ads.e.i.b("Server Option '" + (String)localEntry.getKey() + "' could not be set: Illegal Access");
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          com.google.ads.e.i.b("Server Option '" + (String)localEntry.getKey() + "' could not be set: Bad Type");
        }
      else
        com.google.ads.e.i.e("Unexpected Server Option: " + (String)localEntry.getKey() + " = '" + (String)localEntry.getValue() + "'");
    }
    Object localObject1 = null;
    Iterator localIterator2 = localHashMap.values().iterator();
    Field localField1;
    StringBuilder localStringBuilder;
    String str;
    if (localIterator2.hasNext())
    {
      localField1 = (Field)localIterator2.next();
      if (!((i)localField1.getAnnotation(i.class)).b())
        break label512;
      com.google.ads.e.i.b("Required Server Option missing: " + ((i)localField1.getAnnotation(i.class)).a());
      localStringBuilder = new StringBuilder();
      if (localObject1 == null)
        str = "";
    }
    label412: for (Object localObject2 = str + ((i)localField1.getAnnotation(i.class)).a(); ; localObject2 = localObject1)
    {
      localObject1 = localObject2;
      break;
      str = localObject1 + ", ";
      break label412;
      if (localObject1 != null)
        throw new h("Required Server Option(s) missing: " + localObject1);
      a();
      return;
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.google.ads.c.g
 * JD-Core Version:    0.6.2
 */