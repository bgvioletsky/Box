package com.github.tvbox.bgcode.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.github.tvbox.bgcode.cache.Cache;
import com.github.tvbox.bgcode.cache.CacheDao;
import com.github.tvbox.bgcode.cache.SearchDao;
import com.github.tvbox.bgcode.cache.SearchHistory;
import com.github.tvbox.bgcode.cache.StorageDrive;
import com.github.tvbox.bgcode.cache.StorageDriveDao;
import com.github.tvbox.bgcode.cache.VodCollect;
import com.github.tvbox.bgcode.cache.VodCollectDao;
import com.github.tvbox.bgcode.cache.VodRecord;
import com.github.tvbox.bgcode.cache.VodRecordDao;


/**
 * 类描述:
 *
 * @author pj567
 * @since 2020/5/15
 */
@Database(entities = {Cache.class, VodRecord.class, VodCollect.class, StorageDrive.class, SearchHistory.class}, version = 3)
public abstract class AppDataBase extends RoomDatabase {
    public abstract CacheDao getCacheDao();

    public abstract VodRecordDao getVodRecordDao();

    public abstract VodCollectDao getVodCollectDao();

    public abstract StorageDriveDao getStorageDriveDao();

    public abstract SearchDao getSearchDao();
}
