package org.prx.android.playerhater.service;

import android.net.Uri;
import org.prx.android.playerhater.service.PlayerHaterServiceBinder;

interface PlayerHaterBinderPlugin {

	void onUnbindRequested();
	
	void onSongChanged(int songTag);
	
	void onSongFinished(int songTag, int reason);
	
	void onDurationChanged(int duration);
	
	void onAudioLoading();
	
	void onAudioPaused();
	
	void onAudioResumed();
	
	void onAudioStarted();
	
	void onAudioStopped();
	
	void onTitleChanged(String title);
	
	void onArtistChanged(String artist);
	
	void onAlbumArtResourceChanged(int albumArtResource);
	
	void onAlbumArtUriChanged(in Uri uri);
	
	void onNextSongAvailable(int songTag);
	
	void onNextSongUnavailable();
	
	void onServiceBound(PlayerHaterServiceBinder binder);
	
	void onIntentActivityChanged(in PendingIntent intent);
	
	void onChangesComplete();
	
}