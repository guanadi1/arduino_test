package com.raon.aremotefreegalaxy;

import android.content.Intent;

class al
  implements Runnable
{
  al(SplashActivity paramSplashActivity)
  {
  }

  public void run()
  {
    this.a.startActivity(new Intent(this.a, MainActivity.class));
    this.a.finish();
  }
}

/* Location:           /Users/diego/Documents/workspace/dex2jar-0.0.9.15/classes_dex2jar.jar
 * Qualified Name:     com.raon.aremotefreegalaxy.al
 * JD-Core Version:    0.6.2
 */