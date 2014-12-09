package com.raon.aremotefreegalaxy;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ListView;
import com.raon.remotelib.d;
import java.util.ArrayList;
import java.util.Iterator;

class ag
  implements TextWatcher
{
  ag(SelectBrandActivity paramSelectBrandActivity)
  {
  }

  public void afterTextChanged(Editable paramEditable)
  {
  }

  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramCharSequence.toString().length() > 0)
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = this.a.c.iterator();
      while (localIterator.hasNext())
      {
        d locald = (d)localIterator.next();
        if (locald.c.toLowerCase().contains(paramCharSequence.toString().toLowerCase()))
          localArrayList.add(locald);
      }
      an localan = new an(this.a, 2130903071, localArrayList);
      this.a.b.setAdapter(localan);
    }
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.aremotefreegalaxy.ag
 * JD-Core Version:    0.6.2
 */