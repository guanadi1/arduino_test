package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class d
  implements Parcelable.Creator
{
  public BackStackState a(Parcel paramParcel)
  {
    return new BackStackState(paramParcel);
  }

  public BackStackState[] a(int paramInt)
  {
    return new BackStackState[paramInt];
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.d
 * JD-Core Version:    0.6.2
 */