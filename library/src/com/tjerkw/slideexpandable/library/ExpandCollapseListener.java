package com.tjerkw.slideexpandable.library;

/**
 * Listener to be notified of changes.
 *
 * @author oleavr
 * @date 11/20/13 11:00 PM
 */
public interface ExpandCollapseListener {
    void onExpand(int position);
    void onCollapse(int position);
}