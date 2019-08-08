package org.openstreetmap.atlas.tags;

import org.openstreetmap.atlas.tags.annotations.Tag;
import org.openstreetmap.atlas.tags.annotations.TagKey;

/**
 * This tag denotes roads that should only be driven on by vehicles with 4-wheel drive
 *
 * @author nachtm
 */
@Tag(taginfo = "http://taginfo.openstreetmap.org/keys/4wd_only#values", osm = "https://wiki.openstreetmap.org/wiki/Key:4wd_only")
public enum FourWheelDriveOnlyTag
{
    YES,
    NO;

    @TagKey
    public static final String KEY = "4wd_only";
}
