package com.virtualclass.liveclass;

class LiveClassService {
    public void scheduleLiveClass(LiveClass liveClass) {
        System.out.println("Live class on " + liveClass.topic + " scheduled at " + liveClass.getStartTime());
    }

    public void startLiveSession(LiveClass liveClass) {
        liveClass.startClass();
    }
}
