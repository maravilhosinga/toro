/*
 * Copyright 2016 eneim@Eneim Labs, nam@ene.im
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.ene.lab.toro.sample.legacy.betterlist;

import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import im.ene.lab.toro.ToroAdapter;
import im.ene.lab.toro.sample.legacy.data.VideoItem;

/**
 * Created by eneim on 6/8/16.
 */
public class FinedGrainListAdapter extends ToroAdapter<FinedGrainVideoViewHolder> {
  @Nullable @Override protected Object getItem(int position) {
    return new VideoItem();
  }

  @Override public FinedGrainVideoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(parent.getContext())
        .inflate(FinedGrainVideoViewHolder.LAYOUT_REST, parent, false);
    return new FinedGrainVideoViewHolder(view);
  }

  @Override public int getItemCount() {
    return 512;
  }
}