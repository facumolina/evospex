/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package casestudies.commonsmath4;

/**
 * This class represents a 1D interval.
 * 
 * @see IntervalsSet
 * @since 3.0
 */
public class Interval {

  /** The lower bound of the interval. */
//  private final double lower;
  private double lower;

  /** The upper bound of the interval. */
//  private final double upper;
  private double upper;

  /**
   * Simple constructor.
   * 
   * @param lower
   *          lower bound of the interval
   * @param upper
   *          upper bound of the interval
   */
  public Interval(final double lower, final double upper) {
    if (upper < lower) {
      throw new IllegalArgumentException(
          "NumberIsTooSmallException(LocalizedFormats.ENDPOINTS_NOT_AN_INTERVAL, upper, lower,true)");
    }
    this.lower = lower;
    this.upper = upper;
  }

  /**
   * Get the lower bound of the interval.
   * 
   * @return lower bound of the interval
   * @since 3.1
   */
  public double getInf() {
    return lower;
  }

  /**
   * Get the upper bound of the interval.
   * 
   * @return upper bound of the interval
   * @since 3.1
   */
  public double getSup() {
    return upper;
  }

  /**
   * Get the size of the interval.
   * 
   * @return size of the interval
   * @since 3.1
   */
  public double getSize() {
    return upper - lower;
  }

  /**
   * Get the barycenter of the interval.
   * 
   * @return barycenter of the interval
   * @since 3.1
   */
  public double getBarycenter() {
    return 0.5 * (lower + upper);
  }

  /**
   * Check a point with respect to the interval.
   * 
   * @param point
   *          point to check
   * @param tolerance
   *          tolerance below which points are considered to belong to the boundary
   * @return a code representing the point status: either {@link Location#INSIDE},
   *         {@link Location#OUTSIDE} or {@link Location#BOUNDARY}
   * @since 3.1
   */
  public int checkPoint(final double point, final double tolerance) {
    if (point < lower - tolerance || point > upper + tolerance) {
      return -1; // Location.OUTSIDE;
    } else if (point > lower + tolerance && point < upper - tolerance) {
      return 1; // Location.INSIDE;
    } else {
      return 0; // Location.BOUNDARY;
    }
  }

}