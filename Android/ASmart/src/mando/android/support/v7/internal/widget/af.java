package android.support.v7.internal.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class af
  implements Parcelable.Creator
{
  public ProgressBarICS.SavedState a(Parcel paramParcel)
  {
    return new ProgressBarICS.SavedState(paramParcel, null);
  }

  public ProgressBarICS.SavedState[] a(int paramInt)
  {
    return new ProgressBarICS.SavedState[paramInt];
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.af
 * JD-Core Version:    0.6.2
 */