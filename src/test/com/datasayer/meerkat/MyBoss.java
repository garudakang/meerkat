/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package test.com.datasayer.meerkat;

import java.util.Iterator;

import org.apache.hadoop.io.Writable;

import main.com.datasayer.meerkat.BossMeer;

/**
 * <pre>
 * test.com.datasayer.meerkat
 * MyBoss.java
 * </pre>
 * 
 * @param <M> Recieve Message Object Type from Guard
 * @param <R> Report Object for Realtime IPC
 */
public class MyBoss<M extends MyKeyValue, R extends Writable> extends BossMeer<M,R> {

  @Override
  public R compute(Iterator<M> message) {
    // Aggregate,Compute Logic here
    // return Report Object
    return null;
  }

}
