package android.support.v4.c;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class b
  implements Parcelable.Creator
{
  final c a;

  public b(c paramc)
  {
    this.a = paramc;
  }

  public Object createFromParcel(Parcel paramParcel)
  {
    return this.a.a(paramParcel, null);
  }

  public Object[] newArray(int paramInt)
  {
    return this.a.a(paramInt);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.c.b
 * JD-Core Version:    0.6.2
 */