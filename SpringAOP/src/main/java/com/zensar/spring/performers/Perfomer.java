package com.zensar.spring.performers;

import com.zensar.spring.exceptions.PerformanceException;

public interface Perfomer {
  void perform() throws PerformanceException;
}
