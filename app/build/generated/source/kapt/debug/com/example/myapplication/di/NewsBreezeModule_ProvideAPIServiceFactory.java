// Generated by Dagger (https://dagger.dev).
package com.example.myapplication.di;

import com.example.myapplication.remote.ApiClient;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NewsBreezeModule_ProvideAPIServiceFactory implements Factory<ApiClient> {
  @Override
  public ApiClient get() {
    return provideAPIService();
  }

  public static NewsBreezeModule_ProvideAPIServiceFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ApiClient provideAPIService() {
    return Preconditions.checkNotNullFromProvides(NewsBreezeModule.INSTANCE.provideAPIService());
  }

  private static final class InstanceHolder {
    private static final NewsBreezeModule_ProvideAPIServiceFactory INSTANCE = new NewsBreezeModule_ProvideAPIServiceFactory();
  }
}
