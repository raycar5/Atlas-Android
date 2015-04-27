package com.layer.atlas.atlasdefault;

import android.view.ViewGroup;

import com.layer.atlas.view.ConversationItemView;
import com.layer.atlas.viewholder.ConversationViewHolder;
import com.layer.atlas.viewholder.ConversationViewHolderFactory;

public class DefaultConversationViewHolderFactory extends ConversationViewHolderFactory {
    /**
     * Request a new ConversationViewHolder with the given view type.
     *
     * @param viewType The type of ViewHolder to create.
     * @return The ViewHolder generated by the ViewHolderFactory.
     */
    @Override
    public ConversationViewHolder createViewHolder(ViewGroup viewGroup, int viewType) {
        return new DefaultConversationViewHolder(new ConversationItemView(viewGroup.getContext()));
    }
}