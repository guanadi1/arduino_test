package android.support.v4.d;

import java.util.Iterator;

final class g
  implements Iterator
{
  final int a;
  int b;
  int c;
  boolean d = false;

  g(f paramf, int paramInt)
  {
    this.a = paramInt;
    this.b = paramf.a();
  }

  public boolean hasNext()
  {
    return this.c < this.b;
  }

  public Object next()
  {
    Object localObject = this.e.a(this.c, this.a);
    this.c = (1 + this.c);
    this.d = true;
    return localObject;
  }

  public void remove()
  {
    if (!this.d)
      throw new IllegalStateException();
    this.c = (-1 + this.c);
    this.b = (-1 + this.b);
    this.d = false;
    this.e.a(this.c);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.d.g
 * JD-Core Version:    0.6.2
 */