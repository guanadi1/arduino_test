package android.support.v4.d;

import java.util.Map;

class b extends f
{
  b(a parama)
  {
  }

  protected int a()
  {
    return this.a.h;
  }

  protected int a(Object paramObject)
  {
    if (paramObject == null)
      return this.a.a();
    return this.a.a(paramObject, paramObject.hashCode());
  }

  protected Object a(int paramInt1, int paramInt2)
  {
    return this.a.g[(paramInt2 + (paramInt1 << 1))];
  }

  protected Object a(int paramInt, Object paramObject)
  {
    return this.a.a(paramInt, paramObject);
  }

  protected void a(int paramInt)
  {
    this.a.d(paramInt);
  }

  protected void a(Object paramObject1, Object paramObject2)
  {
    this.a.put(paramObject1, paramObject2);
  }

  protected int b(Object paramObject)
  {
    return this.a.a(paramObject);
  }

  protected Map b()
  {
    return this.a;
  }

  protected void c()
  {
    this.a.clear();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.d.b
 * JD-Core Version:    0.6.2
 */