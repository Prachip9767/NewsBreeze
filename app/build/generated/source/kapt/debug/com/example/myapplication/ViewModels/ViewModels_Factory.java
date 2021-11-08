// Generated by Dagger (https://dagger.dev).
package com.example.myapplication.ViewModels;

import com.example.myapplication.Repo.Repository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ViewModels_Factory implements Factory<ViewModels> {
  private final Provider<Repository> repositoryProvider;

  public ViewModels_Factory(Provider<Repository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ViewModels get() {
    return newInstance(repositoryProvider.get());
  }

  public static ViewModels_Factory create(Provider<Repository> repositoryProvider) {
    return new ViewModels_Factory(repositoryProvider);
  }

  public static ViewModels newInstance(Repository repository) {
    return new ViewModels(repository);
  }
}
