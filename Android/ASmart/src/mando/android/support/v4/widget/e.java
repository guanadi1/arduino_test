package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

class e extends Filter
{
  f a;

  e(f paramf)
  {
    this.a = paramf;
  }

  public CharSequence convertResultToString(Object paramObject)
  {
    return this.a.c((Cursor)paramObject);
  }

  protected Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    Cursor localCursor = this.a.a(paramCharSequence);
    Filter.FilterResults localFilterResults = new Filter.FilterResults();
    if (localCursor != null)
    {
      localFilterResults.count = localCursor.getCount();
      localFilterResults.values = localCursor;
      return localFilterResults;
    }
    localFilterResults.count = 0;
    localFilterResults.values = null;
    return localFilterResults;
  }

  protected void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    Cursor localCursor = this.a.a();
    if ((paramFilterResults.values != null) && (paramFilterResults.values != localCursor))
      this.a.a((Cursor)paramFilterResults.values);
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.e
 * JD-Core Version:    0.6.2
 */