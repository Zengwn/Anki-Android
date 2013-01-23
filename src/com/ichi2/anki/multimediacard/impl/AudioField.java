package com.ichi2.anki.multimediacard.impl;

import java.io.File;

import com.ichi2.anki.multimediacard.EFieldType;
import com.ichi2.anki.multimediacard.IField;

/**
 * @author zaur
 * 
 *         Implementation of Audio field type
 * 
 */
public class AudioField extends FieldBase implements IField
{
	private static final long serialVersionUID = 5033819217738174719L;
	private String mAudioPath;
	private String mName;
	private boolean mHasTemporaryMedia = false;

	@Override
	public EFieldType getType()
	{
		return EFieldType.AUDIO;
	}

	@Override
	public boolean setType(EFieldType type)
	{
		return false;
	}

	@Override
	public boolean isModified()
	{
		return getThisModified();
	}

	@Override
	public String getHtml()
	{
		return null;
	}

	@Override
	public boolean setHtml(String html)
	{
		return false;
	}

	@Override
	public boolean setImagePath(String pathToImage)
	{
		return false;
	}

	@Override
	public String getImagePath()
	{
		return null;
	}

	@Override
	public boolean setAudioPath(String pathToAudio)
	{
		mAudioPath = pathToAudio;
		setThisModified();
		return true;
	}

	@Override
	public String getAudioPath()
	{
		return mAudioPath;
	}

	@Override
	public String getText()
	{
		return null;
	}

	@Override
	public boolean setText(String text)
	{
		return false;
	}

	@Override
	public void setHasTemporaryMedia(boolean hasTemporaryMedia)
	{
		mHasTemporaryMedia = hasTemporaryMedia;
	}

	@Override
	public boolean hasTemporaryMedia()
	{
		return mHasTemporaryMedia;
	}

	@Override
	public String getName()
	{
		return mName;
	}

	@Override
	public void setName(String name)
	{
		mName = name;
	}

	@Override
	public String getFormattedValue()
	{
		File file = new File(getAudioPath());
		if (file.exists())
		{
			return String.format("[sound:%s]", file.getName());
		}
		else
		{
			return "";
		}
	}
}
