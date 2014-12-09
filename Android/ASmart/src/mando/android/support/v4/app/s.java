package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class s
  implements Parcelable.Creator
{
  public FragmentManagerState a(Parcel paramParcel)
  {
    return new FragmentManagerState(paramParcel);
  }

  public FragmentManagerState[] a(int paramInt)
  {
    return new FragmentManagerState[paramInt];
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.s
 * JD-Core Version:    0.6.2
 */