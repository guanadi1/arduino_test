package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class aa
  implements Parcelable.Creator
{
  public SlidingPaneLayout.SavedState a(Parcel paramParcel)
  {
    return new SlidingPaneLayout.SavedState(paramParcel, null);
  }

  public SlidingPaneLayout.SavedState[] a(int paramInt)
  {
    return new SlidingPaneLayout.SavedState[paramInt];
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.aa
 * JD-Core Version:    0.6.2
 */