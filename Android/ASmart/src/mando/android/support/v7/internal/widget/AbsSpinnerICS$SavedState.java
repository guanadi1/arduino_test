package android.support.v7.internal.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

class AbsSpinnerICS$SavedState extends View.BaseSavedState
{
  public static final Parcelable.Creator CREATOR = new e();
  long a;
  int b;

  private AbsSpinnerICS$SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    this.a = paramParcel.readLong();
    this.b = paramParcel.readInt();
  }

  AbsSpinnerICS$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }

  public String toString()
  {
    return "AbsSpinner.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " selectedId=" + this.a + " position=" + this.b + "}";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeLong(this.a);
    paramParcel.writeInt(this.b);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.AbsSpinnerICS.SavedState
 * JD-Core Version:    0.6.2
 */