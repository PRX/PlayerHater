package org.prx.android.playerhater.plugins;

import java.util.ArrayList;
import java.util.List;

import org.prx.android.playerhater.Song;
import android.net.Uri;

public class PluginCollection implements PlayerHaterPluginInterface {

	private final List<PlayerHaterPluginInterface> mListeners;

	public PluginCollection() {
		mListeners = new ArrayList<PlayerHaterPluginInterface>();
	}

	public void add(PlayerHaterPluginInterface listener) {
		mListeners.add(listener);
	}

	@Override
	public void setIsPlaying(boolean isPlaying) {
		for (PlayerHaterPluginInterface listener : mListeners) {
			listener.setIsPlaying(isPlaying);
		}
	}

	@Override
	public void start(Song forSong, int duration) {
		for (PlayerHaterPluginInterface listener : mListeners) {
			listener.start(forSong, duration);
		}
	}

	@Override
	public void stop() {
		for (PlayerHaterPluginInterface listener : mListeners) {
			listener.stop();
		}
	}

	@Override
	public void setTitle(String title) {
		for (PlayerHaterPluginInterface listener : mListeners) {
			listener.setTitle(title);
		}
	}

	@Override
	public void setArtist(String artist) {
		for (PlayerHaterPluginInterface listener : mListeners) {
			listener.setArtist(artist);
		}
	}

	@Override
	public void setAlbumArt(int resourceId) {
		for (PlayerHaterPluginInterface listener : mListeners) {
			listener.setAlbumArt(resourceId);
		}
	}

	@Override
	public void setAlbumArt(Uri url) {
		for (PlayerHaterPluginInterface listener : mListeners) {
			listener.setAlbumArt(url);
		}
	}

	@Override
	public void setCanSkipForward(boolean canSkipForward) {
		for (PlayerHaterPluginInterface listener : mListeners) {
			listener.setCanSkipForward(canSkipForward);
		}
	}

	@Override
	public void setCanSkipBack(boolean canSkipBack) {
		for (PlayerHaterPluginInterface listener : mListeners) {
			listener.setCanSkipBack(canSkipBack);
		}
	}

	@Override
	public void setIsLoading(Song forSong) {
		for (PlayerHaterPluginInterface listener : mListeners) {
			listener.setIsLoading(forSong);
		}
	}

}
