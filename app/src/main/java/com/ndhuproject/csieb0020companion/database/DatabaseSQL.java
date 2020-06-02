package com.ndhuproject.csieb0020companion.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by kevin on 5/5/18.
 */

public class DatabaseSQL extends SQLiteOpenHelper {

    private static final String DATABASE = "csieb0020db";

    // Three tables (functions table, descriptions table, bookmarks table)
    private static final String FUNCTIONSTABLE = "functionstable";
    private static final String DETAILSTABLE = "detailstable";
    private static final String BOOKMARKSTABLE = "bookmarkstable";

    // Attributes of the functions table
    private static final String LIBRARY = "library";
    private static final String FUNCTION = "function";
    // Attributes of the descriptions table
    private static final String FUNCTIONAME = "functioname";
    private static final String FUNCTIONDESCRIPTION = "functiondescription";
    private static final String FUNCTIONSYNOPSIS = "functionsynopsis";
    // Attributes of the bookmarks table
    private static final String ID = "id";
    private static final String BOOKMARK = "bookmark";

    public ArrayList<String> ctypeFunctions;
    public ArrayList<String> localeFunctions;
    public ArrayList<String> mathFunctions;
    public ArrayList<String> setjmpFunctions;
    public ArrayList<String> signalFunctions;
    public ArrayList<String> stdargFunctions;
    public ArrayList<String> stdioFunctions;
    public ArrayList<String> stdlibFunctions;
    public ArrayList<String> stringFunctions;
    public ArrayList<String> timeFunctions;

    public String assertName, assertSynopsis, assertDescription;
    public String isalnumName, isalnumSynopsis, isalnumDescription;
    public String isalphaName, isalphaSynopsis, isalphaDescription;
    public String isblankName, isblankSynopsis, isblankDescription;
    public String iscntrlName, iscntrlSynopsis, iscntrlDescription;
    public String isdigitName, isdigitSynopsis, isdigitDescription;
    public String isgraphName, isgraphSynopsis, isgraphDescription;
    public String islowerName, islowerSynopsis, islowerDescription;
    public String isprintName, isprintSynopsis, isprintDescription;
    public String ispunctName, ispunctSynopsis, ispunctDescription;
    public String isspaceName, isspaceSynopsis, isspaceDescription;
    public String isupperName, isupperSynopsis, isupperDescription;
    public String isxdigitName, isxdigitSynopsis, isxdigitDescription;
    public String tolowerName, tolowerSynopsis, tolowerDescription;
    public String toupperName, toupperSynopsis, toupperDescription;

    public String localeconvName, localeconvSynopsis, localeconvDescription;
    public String setlocaleName, setlocaleSynopsis, setlocaleDescription;

    public String acosName, acosSynopsis, acosDescription;
    public String acoshName, acoshSynopsis, acoshDescription;
    public String asinName, asinSynopsis, asinDescription;
    public String asinhName, asinhSynopsis, asinhDescription;
    public String atanName, atanSynopsis, atanDescription;
    public String atan2Name, atan2Synopsis, atan2Description;
    public String atanhName, atanhSynopsis, atanhDescription;
    public String ceilName, ceilSynopsis, ceilDescription;
    public String copysignName, copysignSynopsis, copysignDescription;
    public String cosName, cosSynopsis, cosDescription;
    public String coshName, coshSynopsis, coshDescription;
    public String erfName, erfSynopsis, erfDescription;
    public String erfcName, erfcSynopsis, erfcDescription;
    public String expName, expSynopsis, expDescription;
    public String exp2Name, exp2Synopsis, exp2Description;
    public String expm1Name, expm1Synopsis, expm1Description;
    public String fabsName, fabsSynopsis, fabsDescription;
    public String fdimName, fdimSynopsis, fdimDescription;
    public String floorName, floorSynopsis, floorDescription;
    public String fmaName, fmaSynopsis, fmaDescription;
    public String fmaxName, fmaxSynopsis, fmaxDescription;
    public String fminName, fminSynopsis, fminDescription;
    public String fmodName, fmodSynopsis, fmodDescription;
    public String fpclassifyName, fpclassifySynopsis, fpclassifyDescription;
    public String frexpName, frexpSynopsis, frexpDescription;
    public String ilogbName, ilogbSynopsis, ilogbDescription;
    public String isfiniteName, isfiniteSynopsis, isfiniteDescription;
    public String isgreaterName, isgreaterSynopsis, isgreaterDescription;
    public String isgreaterequalName, isgreaterequalSynopsis, isgreaterequalDescription;
    public String isinfName, isinfSynopsis, isinfDescription;
    public String islessName, islessSynopsis, islessDescription;
    public String islessequalName, islessequalSynopsis, islessequalDescription;
    public String islessgreaterName, islessgreaterSynopsis, islessgreaterDescription;
    public String isnanName, isnanSynopsis, isnanDescription;
    public String isnormalName, isnormalSynopsis, isnormalDescription;
    public String isunorderedName, isunorderedSynopsis, isunorderedDescription;
    public String ldexpName, ldexpSynopsis, ldexpDescription;
    public String llrintName, llrintSynopsis, llrintDescription;
    public String llroundName, llroundSynopsis, llroundDescription;
    public String logName, logSynopsis, logDescription;
    public String log10Name, log10Synopsis, log10Description;
    public String log1pName, log1pSynopsis, log1pDescription;
    public String log2Name, log2Synopsis, log2Description;
    public String logbName, logbSynopsis, logbDescription;
    public String lrintName, lrintSynopsis, lrintDescription;
    public String lroundName, lroundSynopsis, lroundDescription;
    public String modfName, modfSynopsis, modfDescription;
    public String nearbyintName, nearbyintSynopsis, nearbyintDescription;
    public String powName, powSynopsis, powDescription;
    public String remainderName, remainderSynopsis, remainderDescription;
    public String remquoName, remquoSynopsis, remquoDescription;
    public String rintName, rintSynopsis, rintDescription;
    public String roundName, roundSynopsis, roundDescription;
    public String scalblnName, scalblnSynopsis, scalblnDescription;
    public String scalbnName, scalbnSynopsis, scalbnDescription;
    public String signbitName, signbitSynopsis, signbitDescription;
    public String sinName, sinSynopsis, sinDescription;
    public String sinhName, sinhSynopsis, sinhDescription;
    public String sqrtName, sqrtSynopsis, sqrtDescription;
    public String tanName, tanSynopsis, tanDescription;
    public String tgammaName, tgammaSynopsis, tgammaDescription;
    public String truncName, truncSynopsis, truncDescription;

    public String longjmpName, longjmpSynopsis, longjmpDescription;
    public String setjmpName, setjmpSynopsis, setjmpDescription;

    public String raiseName, raiseSynopsis, raiseDescription;
    public String signalName, signalSynopsis, signalDescription;

    public String stdargName, stdargSynopsis, stdargDescription;
    public String va_argName, va_argSynopsis, va_argDescription;
    public String va_copyName, va_copySynopsis, va_copyDescription;
    public String va_endName, va_endSynopsis, va_endDescription;
    public String va_startName, va_startSynopsis, va_startDescription;

    public String clearerrName, clearerrSynopsis, clearerrDescription;
    public String fcloseName, fcloseSynopsis, fcloseDescription;
    public String feofName, feofSynopsis, feofDescription;
    public String ferrorName, ferrorSynopsis, ferrorDescription;
    public String fflushName, fflushSynopsis, fflushDescription;
    public String fgetcName, fgetcSynopsis, fgetcDescription;
    public String fgetposName, fgetposSynopsis, fgetposDescription;
    public String fgetsName, fgetsSynopsis, fgetsDescription;
    public String fopenName, fopenSynopsis, fopenDescription;
    public String fprintfName, fprintfSynopsis, fprintfDescription;
    public String fputcName, fputcSynopsis, fputcDescription;
    public String fputsName, fputsSynopsis, fputsDescription;
    public String freadName, freadSynopsis, freadDescription;
    public String freopenName, freopenSynopsis, freopenDescription;
    public String fscanfName, fscanfSynopsis, fscanfDescription;
    public String fseekName, fseekSynopsis, fseekDescription;
    public String fsetposName, fsetposSynopsis, fsetposDescription;
    public String ftellName, ftellSynopsis, ftellDescription;
    public String fwriteName, fwriteSynopsis, fwriteDescription;
    public String getcName, getcSynopsis, getcDescription;
    public String getcharName, getcharSynopsis, getcharDescription;
    public String getsName, getsSynopsis, getsDescription;
    public String perrorName, perrorSynopsis, perrorDescription;
    public String printfName, printfSynopsis, printfDescription;
    public String putcName, putcSynopsis, putcDescription;
    public String putcharName, putcharSynopsis, putcharDescription;
    public String putsName, putsSynopsis, putsDescription;
    public String removeName, removeSynopsis, removeDescription;
    public String rewindName, rewindSynopsis, rewindDescription;
    public String scanfName, scanfSynopsis, scanfDescription;
    public String setbufName, setbufSynopsis, setbufDescription;
    public String setvbufName, setvbufSynopsis, setvbufDescription;
    public String snprintfName, snprintfSynopsis, snprintfDescription;
    public String sprintfName, sprintfSynopsis, sprintfDescription;
    public String sscanfName, sscanfSynopsis, sscanfDescription;
    public String tmpfileName, tmpfileSynopsis, tmpfileDescription;
    public String tmpnamName, tmpnamSynopsis, tmpnamDescription;
    public String ungetcName, ungetcSynopsis, ungetcDescription;
    public String vfprintfName, vfprintfSynopsis, vfprintfDescription;
    public String vfscanfName, vfscanfSynopsis, vfscanfDescription;
    public String vprintfName, vprintfSynopsis, vprintfDescription;
    public String vscanfName, vscanfSynopsis, vscanfDescription;
    public String vsnprintfName, vsnprintfSynopsis, vsnprintfDescription;
    public String vsprintfName, vsprintfSynopsis, vsprintfDescription;
    public String vsscanfName, vsscanfSynopsis, vsscanfDescription;
    public String abortName, abortSynopsis, abortDescription;
    public String absName, absSynopsis, absDescription;
    public String atexitName, atexitSynopsis, atexitDescription;
    public String atofName, atofSynopsis, atofDescription;
    public String atoiName, atoiSynopsis, atoiDescription;
    public String atolName, atolSynopsis, atolDescription;
    public String atollName, atollSynopsis, atollDescription;
    public String bsearchName, bsearchSynopsis, bsearchDescription;
    public String callocName, callocSynopsis, callocDescription;
    public String divName, divSynopsis, divDescription;
    public String drand48Name, drand48Synopsis, drand48Description;
    public String exitName, exitSynopsis, exitDescription;
    public String freeName, freeSynopsis, freeDescription;
    public String getenvName, getenvSynopsis, getenvDescription;
    public String labsName, labsSynopsis, labsDescription;
    public String ldivName, ldivSynopsis, ldivDescription;
    public String llabsName, llabsSynopsis, llabsDescription;
    public String lldivName, lldivSynopsis, lldivDescription;
    public String mallocName, mallocSynopsis, mallocDescription;
    public String mblenName, mblenSynopsis, mblenDescription;
    public String mbstowcsName, mbstowcsSynopsis, mbstowcsDescription;
    public String mbtowcName, mbtowcSynopsis, mbtowcDescription;
    public String qsortName, qsortSynopsis, qsortDescription;
    public String randName, randSynopsis, randDescription;
    public String reallocName, reallocSynopsis, reallocDescription;
    public String srandName, srandSynopsis, srandDescription;
    public String srand48Name, srand48Synopsis, srand48Description;
    public String strtodName, strtodSynopsis, strtodDescription;
    public String strtofName, strtofSynopsis, strtofDescription;
    public String strtolName, strtolSynopsis, strtolDescription;
    public String strtoldName, strtoldSynopsis, strtoldDescription;
    public String strtollName, strtollSynopsis, strtollDescription;
    public String strtoulName, strtoulSynopsis, strtoulDescription;
    public String strtoullName, strtoullSynopsis, strtoullDescription;
    public String systemName, systemSynopsis, systemDescription;
    public String wcstombsName, wcstombsSynopsis, wcstombsDescription;
    public String wctombName, wctombSynopsis, wctombDescription;
    public String memchrName, memchrSynopsis, memchrDescription;
    public String memcmpName, memcmpSynopsis, memcmpDescription;
    public String memcpyName, memcpySynopsis, memcpyDescription;
    public String memmoveName, memmoveSynopsis, memmoveDescription;
    public String memsetName, memsetSynopsis, memsetDescription;
    public String strcatName, strcatSynopsis, strcatDescription;
    public String strchrName, strchrSynopsis, strchrDescription;
    public String strcmpName, strcmpSynopsis, strcmpDescription;
    public String strcollName, strcollSynopsis, strcollDescription;
    public String strcpyName, strcpySynopsis, strcpyDescription;
    public String strcspnName, strcspnSynopsis, strcspnDescription;
    public String strerrorName, strerrorSynopsis, strerrorDescription;
    public String strlenName, strlenSynopsis, strlenDescription;
    public String strncatName, strncatSynopsis, strncatDescription;
    public String strncmpName, strncmpSynopsis, strncmpDescription;
    public String strncpyName, strncpySynopsis, strncpyDescription;
    public String strpbrkName, strpbrkSynopsis, strpbrkDescription;
    public String strrchrName, strrchrSynopsis, strrchrDescription;
    public String strspnName, strspnSynopsis, strspnDescription;
    public String strstrName, strstrSynopsis, strstrDescription;
    public String strtokName, strtokSynopsis, strtokDescription;
    public String strxfrmName, strxfrmSynopsis, strxfrmDescription;
    public String asctimeName, asctimeSynopsis, asctimeDescription;
    public String clockName, clockSynopsis, clockDescription;
    public String ctimeName, ctimeSynopsis, ctimeDescription;
    public String difftimeName, difftimeSynopsis, difftimeDescription;
    public String gmtimeName, gmtimeSynopsis, gmtimeDescription;
    public String localtimeName, localtimeSynopsis, localtimeDescription;
    public String mktimeName, mktimeSynopsis, mktimeDescription;
    public String strftimeName, strftimeSynopsis, strftimeDescription;
    public String timeName, timeSynopsis, timeDescription;



    public DatabaseSQL(Context context) {
        super(context, DATABASE, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE IF NOT EXISTS functionstable" + " (" + LIBRARY + " TEXT, " + FUNCTION + " TEXT)");
        db.execSQL("CREATE TABLE IF NOT EXISTS detailstable" + " (" + FUNCTION + " TEXT, " + FUNCTIONAME + " TEXT, " + FUNCTIONSYNOPSIS + " TEXT, " + FUNCTIONDESCRIPTION + " TEXT)");
        db.execSQL("CREATE TABLE IF NOT EXISTS bookmarkstable" + " (" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + BOOKMARK + " TEXT)");
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + FUNCTIONSTABLE);
        db.execSQL("DROP TABLE IF EXISTS " + DETAILSTABLE);
        db.execSQL("DROP TABLE IF EXISTS " + BOOKMARKSTABLE);

        onCreate(db);
    }


    public boolean addBookmark(String functionName){

        if(checkExistingBookmark(functionName)){
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues content = new ContentValues();
            content.put(BOOKMARK, functionName);
            db.insert(BOOKMARKSTABLE, null, content);
            return true;
        }
        return false;
    }



    public void deleteBookmark(String functionName){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(BOOKMARKSTABLE, BOOKMARK + " = ?" , new String[]{functionName});
    }


    public ArrayList<String> displayBookmarks(){
        ArrayList<String> myArray= new ArrayList<String>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cur = db.rawQuery("SELECT * FROM " + BOOKMARKSTABLE, null);
        cur.moveToFirst();
        while(cur.isAfterLast()==false){
            myArray.add(cur.getString(cur.getColumnIndex(BOOKMARK)));
            cur.moveToNext();
        }
        return myArray;
    }


    public boolean checkExistingBookmark(String functionName){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cur = db.rawQuery("SELECT * FROM "+BOOKMARKSTABLE, null);
        cur.moveToFirst();
        while(cur.isAfterLast()==false){
            if(functionName.equals(cur.getString(cur.getColumnIndex(BOOKMARK)))){
                return false;
            }
            cur.moveToNext();
        }
        return true;
    }


    public boolean initializeData(String library, String function){
        setupLibraries();
        if(checkEmptyTable()){
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues content = new ContentValues();
            // Assert Library
            content.put(LIBRARY, library);
            content.put(FUNCTION, function);
            db.insert(FUNCTIONSTABLE, null, content);
            // - Assert Library -
            for(int i=0; i<ctypeFunctions.size(); i++){
                content.put(LIBRARY, "ctype.h");
                content.put(FUNCTION, ctypeFunctions.get(i).toString());
                db.insert(FUNCTIONSTABLE, null, content);
            }
            for(int i=0; i<localeFunctions.size(); i++){
                content.put(LIBRARY, "locale.h");
                content.put(FUNCTION, localeFunctions.get(i).toString());
                db.insert(FUNCTIONSTABLE, null, content);
            }
            for(int i=0; i<mathFunctions.size(); i++){
                content.put(LIBRARY, "math.h");
                content.put(FUNCTION, mathFunctions.get(i).toString());
                db.insert(FUNCTIONSTABLE, null, content);
            }
            for(int i=0; i<setjmpFunctions.size(); i++){
                content.put(LIBRARY, "setjmp.h");
                content.put(FUNCTION, setjmpFunctions.get(i).toString());
                db.insert(FUNCTIONSTABLE, null, content);
            }
            for(int i=0; i<signalFunctions.size(); i++){
                content.put(LIBRARY, "signal.h");
                content.put(FUNCTION, signalFunctions.get(i).toString());
                db.insert(FUNCTIONSTABLE, null, content);
            }
            for(int i=0; i<stdargFunctions.size(); i++){
                content.put(LIBRARY, "stdarg.h");
                content.put(FUNCTION, stdargFunctions.get(i).toString());
                db.insert(FUNCTIONSTABLE, null, content);
            }
            for(int i=0; i<stdioFunctions.size(); i++){
                content.put(LIBRARY, "stdio.h");
                content.put(FUNCTION, stdioFunctions.get(i).toString());
                db.insert(FUNCTIONSTABLE, null, content);
            }
            for(int i=0; i<stdlibFunctions.size(); i++){
                content.put(LIBRARY, "stdlib.h");
                content.put(FUNCTION, stdlibFunctions.get(i).toString());
                db.insert(FUNCTIONSTABLE, null, content);
            }
            for(int i=0; i<stringFunctions.size(); i++){
                content.put(LIBRARY, "string.h");
                content.put(FUNCTION, stringFunctions.get(i).toString());
                db.insert(FUNCTIONSTABLE, null, content);
            }
            for(int i=0; i<timeFunctions.size(); i++){
                content.put(LIBRARY, "time.h");
                content.put(FUNCTION, timeFunctions.get(i).toString());
                db.insert(FUNCTIONSTABLE, null, content);
            }
            db.close();
            initializeDetails();
            return true;
        }
        return true;
    }


    public void initializeDetails(){
        setupFunctionData();
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        //--------assert
        values.put(FUNCTION, "assert");
        values.put(FUNCTIONAME, assertName.toString());
        values.put(FUNCTIONSYNOPSIS, assertSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, assertDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------isalnum
        values.put(FUNCTION, "isalnum");
        values.put(FUNCTIONAME, isalnumName.toString());
        values.put(FUNCTIONSYNOPSIS, isalnumSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, isalnumDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------isalpha
        values.put(FUNCTION, "isalpha");
        values.put(FUNCTIONAME, isalphaName.toString());
        values.put(FUNCTIONSYNOPSIS, isalphaSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, isalphaDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------isblank
        values.put(FUNCTION, "isblank");
        values.put(FUNCTIONAME, isblankName.toString());
        values.put(FUNCTIONSYNOPSIS, isblankSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, isblankDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------iscntrl
        values.put(FUNCTION, "iscntrl");
        values.put(FUNCTIONAME, iscntrlName.toString());
        values.put(FUNCTIONSYNOPSIS, iscntrlSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, iscntrlDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------isdigit
        values.put(FUNCTION, "isdigit");
        values.put(FUNCTIONAME, isdigitName.toString());
        values.put(FUNCTIONSYNOPSIS, isdigitSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, isdigitDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------isgraph
        values.put(FUNCTION, "isgraph");
        values.put(FUNCTIONAME, isgraphName.toString());
        values.put(FUNCTIONSYNOPSIS, isgraphSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, isgraphDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------islower
        values.put(FUNCTION, "isalpha");
        values.put(FUNCTIONAME, islowerName.toString());
        values.put(FUNCTIONSYNOPSIS, islowerSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, islowerDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------isprint
        values.put(FUNCTION, "isprint");
        values.put(FUNCTIONAME, isprintName.toString());
        values.put(FUNCTIONSYNOPSIS, isprintSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, isprintDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------ispunct
        values.put(FUNCTION, "ispunct");
        values.put(FUNCTIONAME, ispunctName.toString());
        values.put(FUNCTIONSYNOPSIS, ispunctSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, ispunctDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------isspace
        values.put(FUNCTION, "isspace");
        values.put(FUNCTIONAME, isspaceName.toString());
        values.put(FUNCTIONSYNOPSIS, isspaceSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, isspaceDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------isupper
        values.put(FUNCTION, "isupper");
        values.put(FUNCTIONAME, isupperName.toString());
        values.put(FUNCTIONSYNOPSIS, isupperSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, isupperDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------isxdigit
        values.put(FUNCTION, "isxdigit");
        values.put(FUNCTIONAME, isxdigitName.toString());
        values.put(FUNCTIONSYNOPSIS, isxdigitSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, isxdigitDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------tolower
        values.put(FUNCTION, "tolower");
        values.put(FUNCTIONAME, tolowerName.toString());
        values.put(FUNCTIONSYNOPSIS, tolowerSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, tolowerDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------toupper
        values.put(FUNCTION, "toupper");
        values.put(FUNCTIONAME, toupperName.toString());
        values.put(FUNCTIONSYNOPSIS, toupperSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, toupperDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------localeconv
        values.put(FUNCTION, "localeconv");
        values.put(FUNCTIONAME, localeconvName.toString());
        values.put(FUNCTIONSYNOPSIS, localeconvSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, localeconvDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------setlocale
        values.put(FUNCTION, "setlocale");
        values.put(FUNCTIONAME, setlocaleName.toString());
        values.put(FUNCTIONSYNOPSIS, setlocaleSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, setlocaleDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------acos
        values.put(FUNCTION, "acos");
        values.put(FUNCTIONAME, acosName.toString());
        values.put(FUNCTIONSYNOPSIS, acosSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, acosDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------acosh
        values.put(FUNCTION, "acosh");
        values.put(FUNCTIONAME, acoshName.toString());
        values.put(FUNCTIONSYNOPSIS, acoshSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, acoshDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------asin
        values.put(FUNCTION, "asin");
        values.put(FUNCTIONAME, asinName.toString());
        values.put(FUNCTIONSYNOPSIS, asinhSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, asinDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------asinh
        values.put(FUNCTION, "asinh");
        values.put(FUNCTIONAME, asinhName.toString());
        values.put(FUNCTIONSYNOPSIS, asinhSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, asinhDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------atan
        values.put(FUNCTION, "atan");
        values.put(FUNCTIONAME, atanName.toString());
        values.put(FUNCTIONSYNOPSIS, atanSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, atanDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------atan2
        values.put(FUNCTION, "atan2");
        values.put(FUNCTIONAME, atan2Name.toString());
        values.put(FUNCTIONSYNOPSIS, atan2Synopsis.toString());
        values.put(FUNCTIONDESCRIPTION, atan2Description.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------atanh
        values.put(FUNCTION, "atanh");
        values.put(FUNCTIONAME, atanhName.toString());
        values.put(FUNCTIONSYNOPSIS, atanhSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, atanhDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------ceil
        values.put(FUNCTION, "ceil");
        values.put(FUNCTIONAME, ceilName.toString());
        values.put(FUNCTIONSYNOPSIS, ceilSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, ceilDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------copysign
        values.put(FUNCTION, "copysign");
        values.put(FUNCTIONAME, copysignName.toString());
        values.put(FUNCTIONSYNOPSIS, copysignSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, copysignDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------cos
        values.put(FUNCTION, "cos");
        values.put(FUNCTIONAME, cosName.toString());
        values.put(FUNCTIONSYNOPSIS, cosSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, cosDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------cosh
        values.put(FUNCTION, "cosh");
        values.put(FUNCTIONAME, coshName.toString());
        values.put(FUNCTIONSYNOPSIS, coshSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, coshDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------erf
        values.put(FUNCTION, "erf");
        values.put(FUNCTIONAME, erfName.toString());
        values.put(FUNCTIONSYNOPSIS, erfSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, erfDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------erfc
        values.put(FUNCTION, "erfc");
        values.put(FUNCTIONAME, erfcName.toString());
        values.put(FUNCTIONSYNOPSIS, erfcSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, erfcDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------exp
        values.put(FUNCTION, "exp");
        values.put(FUNCTIONAME, expName.toString());
        values.put(FUNCTIONSYNOPSIS, expSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, expDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------exp2
        values.put(FUNCTION, "exp2");
        values.put(FUNCTIONAME, exp2Name.toString());
        values.put(FUNCTIONSYNOPSIS, exp2Synopsis.toString());
        values.put(FUNCTIONDESCRIPTION, exp2Description.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------expm1
        values.put(FUNCTION, "expm1");
        values.put(FUNCTIONAME, expm1Name.toString());
        values.put(FUNCTIONSYNOPSIS, expm1Synopsis.toString());
        values.put(FUNCTIONDESCRIPTION, expm1Description.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------fabs
        values.put(FUNCTION, "fabs");
        values.put(FUNCTIONAME, fabsName.toString());
        values.put(FUNCTIONSYNOPSIS, fabsSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, fabsDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------fdim
        values.put(FUNCTION, "fdim");
        values.put(FUNCTIONAME, fdimName.toString());
        values.put(FUNCTIONSYNOPSIS, fdimSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, fdimDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------floor
        values.put(FUNCTION, "floor");
        values.put(FUNCTIONAME, floorName.toString());
        values.put(FUNCTIONSYNOPSIS, floorSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, floorDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------fma
        values.put(FUNCTION, "fma");
        values.put(FUNCTIONAME, fmaName.toString());
        values.put(FUNCTIONSYNOPSIS, fmaSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, fmaDescription.toString());
        db.insert(DETAILSTABLE, null, values);


        //--------fmax
        values.put(FUNCTION, "fmax");
        values.put(FUNCTIONAME, fmaxName.toString());
        values.put(FUNCTIONSYNOPSIS, fmaxSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, fmaxDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------fmin
        values.put(FUNCTION, "fmin");
        values.put(FUNCTIONAME, fminName.toString());
        values.put(FUNCTIONSYNOPSIS, fminSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, fminDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------fmod
        values.put(FUNCTION, "fmod");
        values.put(FUNCTIONAME, fmodName.toString());
        values.put(FUNCTIONSYNOPSIS, fmodSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, fmodDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------fpclassify
        values.put(FUNCTION, "fpclassify");
        values.put(FUNCTIONAME, fpclassifyName.toString());
        values.put(FUNCTIONSYNOPSIS, fpclassifySynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, fpclassifyDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------frexp
        values.put(FUNCTION, "frexp");
        values.put(FUNCTIONAME, frexpName.toString());
        values.put(FUNCTIONSYNOPSIS, frexpSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, frexpDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------ilogb
        values.put(FUNCTION, "ilogb");
        values.put(FUNCTIONAME, ilogbName.toString());
        values.put(FUNCTIONSYNOPSIS, ilogbSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, ilogbDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------isfinite
        values.put(FUNCTION, "isfinite");
        values.put(FUNCTIONAME, isfiniteName.toString());
        values.put(FUNCTIONSYNOPSIS, isfiniteSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, isfiniteDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------isgreater
        values.put(FUNCTION, "isgreater");
        values.put(FUNCTIONAME, isgreaterName.toString());
        values.put(FUNCTIONSYNOPSIS, isgreaterSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, isgreaterDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------isgreaterequal
        values.put(FUNCTION, "isgreaterequal");
        values.put(FUNCTIONAME, isgreaterequalName.toString());
        values.put(FUNCTIONSYNOPSIS, isgreaterSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, isgreaterequalDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------isinf
        values.put(FUNCTION, "isinf");
        values.put(FUNCTIONAME, isinfName.toString());
        values.put(FUNCTIONSYNOPSIS, isinfSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, isinfDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------isless
        values.put(FUNCTION, "isless");
        values.put(FUNCTIONAME, islessName.toString());
        values.put(FUNCTIONSYNOPSIS, islessSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, islessDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------islessequal
        values.put(FUNCTION, "islessequal");
        values.put(FUNCTIONAME, islessequalName.toString());
        values.put(FUNCTIONSYNOPSIS, islessequalSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, islessequalDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------islessgreater
        values.put(FUNCTION, "islessgreater");
        values.put(FUNCTIONAME, islessgreaterName.toString());
        values.put(FUNCTIONSYNOPSIS, islessgreaterSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, islessgreaterDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------isnan
        values.put(FUNCTION, "isnan");
        values.put(FUNCTIONAME, isnanName.toString());
        values.put(FUNCTIONSYNOPSIS, isnanSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, isnanDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------isnormal
        values.put(FUNCTION, "isnormal");
        values.put(FUNCTIONAME, isnormalName.toString());
        values.put(FUNCTIONSYNOPSIS, isnormalSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, isnormalDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------isunordered
        values.put(FUNCTION, "isunordered");
        values.put(FUNCTIONAME, isunorderedName.toString());
        values.put(FUNCTIONSYNOPSIS, isunorderedSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, isunorderedDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------ldexp
        values.put(FUNCTION, "ldexp");
        values.put(FUNCTIONAME, ldexpName.toString());
        values.put(FUNCTIONSYNOPSIS, ldexpSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, ldexpDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------llrint
        values.put(FUNCTION, "llrint");
        values.put(FUNCTIONAME, llrintName.toString());
        values.put(FUNCTIONSYNOPSIS, llrintSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, llrintDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------llround
        values.put(FUNCTION, "llround");
        values.put(FUNCTIONAME, llroundName.toString());
        values.put(FUNCTIONSYNOPSIS, llroundSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, llroundDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------log
        values.put(FUNCTION, "log");
        values.put(FUNCTIONAME, logName.toString());
        values.put(FUNCTIONSYNOPSIS, logSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, logDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------log10
        values.put(FUNCTION, "log10");
        values.put(FUNCTIONAME, log10Name.toString());
        values.put(FUNCTIONSYNOPSIS, log10Synopsis.toString());
        values.put(FUNCTIONDESCRIPTION, log10Description.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------log1p
        values.put(FUNCTION, "log1p");
        values.put(FUNCTIONAME, log1pName.toString());
        values.put(FUNCTIONSYNOPSIS, log1pSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, log1pDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------log2
        values.put(FUNCTION, "log2");
        values.put(FUNCTIONAME, log2Name.toString());
        values.put(FUNCTIONSYNOPSIS, log2Synopsis.toString());
        values.put(FUNCTIONDESCRIPTION, log2Description.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------logb
        values.put(FUNCTION, "logb");
        values.put(FUNCTIONAME, logbName.toString());
        values.put(FUNCTIONSYNOPSIS, logbSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, logbDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------lrint
        values.put(FUNCTION, "lrint");
        values.put(FUNCTIONAME, lrintName.toString());
        values.put(FUNCTIONSYNOPSIS, lrintSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, lrintDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------lround
        values.put(FUNCTION, "lround");
        values.put(FUNCTIONAME, lroundName.toString());
        values.put(FUNCTIONSYNOPSIS, lroundSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, lroundDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------modf
        values.put(FUNCTION, "modf");
        values.put(FUNCTIONAME, modfName.toString());
        values.put(FUNCTIONSYNOPSIS, modfSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, modfDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------nearbyint
        values.put(FUNCTION, "nearbyint");
        values.put(FUNCTIONAME, nearbyintName.toString());
        values.put(FUNCTIONSYNOPSIS, nearbyintSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, nearbyintDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------pow
        values.put(FUNCTION, "pow");
        values.put(FUNCTIONAME, powName.toString());
        values.put(FUNCTIONSYNOPSIS, powSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, powDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------remainder
        values.put(FUNCTION, "remainder");
        values.put(FUNCTIONAME, remainderName.toString());
        values.put(FUNCTIONSYNOPSIS, remainderSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, remainderDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------remquo
        values.put(FUNCTION, "remquo");
        values.put(FUNCTIONAME, remquoName.toString());
        values.put(FUNCTIONSYNOPSIS, remquoSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, remquoDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------rint
        values.put(FUNCTION, "rint");
        values.put(FUNCTIONAME, rintName.toString());
        values.put(FUNCTIONSYNOPSIS, rintSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, rintDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------round
        values.put(FUNCTION, "round");
        values.put(FUNCTIONAME, roundName.toString());
        values.put(FUNCTIONSYNOPSIS, roundSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, roundDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------scalbln
        values.put(FUNCTION, "scalbln");
        values.put(FUNCTIONAME, scalblnName.toString());
        values.put(FUNCTIONSYNOPSIS, scalblnSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, scalblnDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------scalbn
        values.put(FUNCTION, "scalbn");
        values.put(FUNCTIONAME, scalbnName.toString());
        values.put(FUNCTIONSYNOPSIS, scalbnSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, scalbnDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------signbit
        values.put(FUNCTION, "signbit");
        values.put(FUNCTIONAME, signbitName.toString());
        values.put(FUNCTIONSYNOPSIS, signbitSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, signbitDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------sin
        values.put(FUNCTION, "sin");
        values.put(FUNCTIONAME, sinName.toString());
        values.put(FUNCTIONSYNOPSIS, sinSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, sinDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------sinh
        values.put(FUNCTION, "sinh");
        values.put(FUNCTIONAME, sinhName.toString());
        values.put(FUNCTIONSYNOPSIS, sinhSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, sinhDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------sqrt
        values.put(FUNCTION, "sqrt");
        values.put(FUNCTIONAME, sqrtName.toString());
        values.put(FUNCTIONSYNOPSIS, sqrtSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, sqrtDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------tan
        values.put(FUNCTION, "tan");
        values.put(FUNCTIONAME, tanName.toString());
        values.put(FUNCTIONSYNOPSIS, tanSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, tanDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------tgamma
        values.put(FUNCTION, "tgamma");
        values.put(FUNCTIONAME, tgammaName.toString());
        values.put(FUNCTIONSYNOPSIS, tgammaSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, tgammaDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------trunc
        values.put(FUNCTION, "trunc");
        values.put(FUNCTIONAME, truncName.toString());
        values.put(FUNCTIONSYNOPSIS, truncSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, truncDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------longjmp
        values.put(FUNCTION, "longjmp");
        values.put(FUNCTIONAME, longjmpName.toString());
        values.put(FUNCTIONSYNOPSIS, longjmpSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, longjmpDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------setjmp
        values.put(FUNCTION, "setjmp");
        values.put(FUNCTIONAME, setjmpName.toString());
        values.put(FUNCTIONSYNOPSIS, setjmpSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, setjmpDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------raise
        values.put(FUNCTION, "raise");
        values.put(FUNCTIONAME, raiseName.toString());
        values.put(FUNCTIONSYNOPSIS, raiseSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, raiseDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------signal
        values.put(FUNCTION, "signal");
        values.put(FUNCTIONAME, signalName.toString());
        values.put(FUNCTIONSYNOPSIS, signalSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, signalDescription.toString());
        db.insert(DETAILSTABLE, null, values);

        //--------stdarg
        values.put(FUNCTION, "stdarg");
        values.put(FUNCTIONAME, stdargName.toString());
        values.put(FUNCTIONSYNOPSIS, stdargSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, stdargDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------va_arg
        values.put(FUNCTION, "va_arg");
        values.put(FUNCTIONAME, va_argName.toString());
        values.put(FUNCTIONSYNOPSIS, va_argSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, va_argDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------va_copy
        values.put(FUNCTION, "va_copy");
        values.put(FUNCTIONAME, va_copyName.toString());
        values.put(FUNCTIONSYNOPSIS, va_copySynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, va_copyDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------va_end
        values.put(FUNCTION, "va_end");
        values.put(FUNCTIONAME, va_endName.toString());
        values.put(FUNCTIONSYNOPSIS, va_endSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, va_endDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------va_start
        values.put(FUNCTION, "va_start");
        values.put(FUNCTIONAME, va_startName.toString());
        values.put(FUNCTIONSYNOPSIS, va_startSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, va_startDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------clearerr
        values.put(FUNCTION, "clearerr");
        values.put(FUNCTIONAME, clearerrName.toString());
        values.put(FUNCTIONSYNOPSIS, clearerrSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, clearerrDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------fclose
        values.put(FUNCTION, "fclose");
        values.put(FUNCTIONAME, fcloseName.toString());
        values.put(FUNCTIONSYNOPSIS, fcloseSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, fcloseDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------feof
        values.put(FUNCTION, "feof");
        values.put(FUNCTIONAME, feofName.toString());
        values.put(FUNCTIONSYNOPSIS, feofSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, feofDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------ferror
        values.put(FUNCTION, "ferror");
        values.put(FUNCTIONAME, ferrorName.toString());
        values.put(FUNCTIONSYNOPSIS, ferrorSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, ferrorDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------fflush
        values.put(FUNCTION, "fflush");
        values.put(FUNCTIONAME, fflushName.toString());
        values.put(FUNCTIONSYNOPSIS, fflushSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, fflushDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------fgetc
        values.put(FUNCTION, "fgetc");
        values.put(FUNCTIONAME, fgetcName.toString());
        values.put(FUNCTIONSYNOPSIS, fgetcSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, fgetcDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------fgetpos
        values.put(FUNCTION, "fgetpos");
        values.put(FUNCTIONAME, fgetposName.toString());
        values.put(FUNCTIONSYNOPSIS, fgetposSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, fgetposDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------fgets
        values.put(FUNCTION, "fgets");
        values.put(FUNCTIONAME, fgetsName.toString());
        values.put(FUNCTIONSYNOPSIS, fgetsSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, fgetsDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------fopen
        values.put(FUNCTION, "fopen");
        values.put(FUNCTIONAME, fopenName.toString());
        values.put(FUNCTIONSYNOPSIS, fopenSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, fopenDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------fprintf
        values.put(FUNCTION, "fprintf");
        values.put(FUNCTIONAME, fprintfName.toString());
        values.put(FUNCTIONSYNOPSIS, fprintfSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, fprintfDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------fputc
        values.put(FUNCTION, "fputc");
        values.put(FUNCTIONAME, fputcName.toString());
        values.put(FUNCTIONSYNOPSIS, fputcSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, fputcDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------fputs
        values.put(FUNCTION, "fputs");
        values.put(FUNCTIONAME, fputsName.toString());
        values.put(FUNCTIONSYNOPSIS, fputsSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, fputsDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------fread
        values.put(FUNCTION, "fread");
        values.put(FUNCTIONAME, freadName.toString());
        values.put(FUNCTIONSYNOPSIS, freadSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, freadDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------freopen
        values.put(FUNCTION, "freopen");
        values.put(FUNCTIONAME, freopenName.toString());
        values.put(FUNCTIONSYNOPSIS, freopenSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, freopenDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------fscanf
        values.put(FUNCTION, "fscanf");
        values.put(FUNCTIONAME, fscanfName.toString());
        values.put(FUNCTIONSYNOPSIS, fscanfSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, fscanfDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------fseek
        values.put(FUNCTION, "fseek");
        values.put(FUNCTIONAME, fseekName.toString());
        values.put(FUNCTIONSYNOPSIS, fseekSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, fseekDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------fsetpos
        values.put(FUNCTION, "fsetpos");
        values.put(FUNCTIONAME, fsetposName.toString());
        values.put(FUNCTIONSYNOPSIS, fsetposSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, fsetposDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------ftell
        values.put(FUNCTION, "ftell");
        values.put(FUNCTIONAME, ftellName.toString());
        values.put(FUNCTIONSYNOPSIS, ftellSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, ftellDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------fwrite
        values.put(FUNCTION, "fwrite");
        values.put(FUNCTIONAME, fwriteName.toString());
        values.put(FUNCTIONSYNOPSIS, fwriteSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, fwriteDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------getc
        values.put(FUNCTION, "getc");
        values.put(FUNCTIONAME, getcName.toString());
        values.put(FUNCTIONSYNOPSIS, getcSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, getcDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------getchar
        values.put(FUNCTION, "getchar");
        values.put(FUNCTIONAME, getcharName.toString());
        values.put(FUNCTIONSYNOPSIS, getcharSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, getcharDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------gets
        values.put(FUNCTION, "gets");
        values.put(FUNCTIONAME, getsName.toString());
        values.put(FUNCTIONSYNOPSIS, getsSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, getsDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------perror
        values.put(FUNCTION, "perror");
        values.put(FUNCTIONAME, perrorName.toString());
        values.put(FUNCTIONSYNOPSIS, perrorSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, perrorDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------printf
        values.put(FUNCTION, "printf");
        values.put(FUNCTIONAME, printfName.toString());
        values.put(FUNCTIONSYNOPSIS, printfSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, printfDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------putc
        values.put(FUNCTION, "putc");
        values.put(FUNCTIONAME, putcName.toString());
        values.put(FUNCTIONSYNOPSIS, putcSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, putcDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------putchar
        values.put(FUNCTION, "putchar");
        values.put(FUNCTIONAME, putcharName.toString());
        values.put(FUNCTIONSYNOPSIS, putcharSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, putcharDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------puts
        values.put(FUNCTION, "puts");
        values.put(FUNCTIONAME, putsName.toString());
        values.put(FUNCTIONSYNOPSIS, putsSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, putsDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------remove
        values.put(FUNCTION, "remove");
        values.put(FUNCTIONAME, removeName.toString());
        values.put(FUNCTIONSYNOPSIS, removeSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, removeDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------rewind
        values.put(FUNCTION, "rewind");
        values.put(FUNCTIONAME, rewindName.toString());
        values.put(FUNCTIONSYNOPSIS, rewindSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, rewindDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------scanf
        values.put(FUNCTION, "scanf");
        values.put(FUNCTIONAME, scanfName.toString());
        values.put(FUNCTIONSYNOPSIS, scanfSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, scanfDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------setbuf
        values.put(FUNCTION, "setbuf");
        values.put(FUNCTIONAME, setbufName.toString());
        values.put(FUNCTIONSYNOPSIS, setbufSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, setbufDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------setvbuf
        values.put(FUNCTION, "setvbuf");
        values.put(FUNCTIONAME, setvbufName.toString());
        values.put(FUNCTIONSYNOPSIS, setvbufSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, setvbufDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------snprintf
        values.put(FUNCTION, "snprintf");
        values.put(FUNCTIONAME, snprintfName.toString());
        values.put(FUNCTIONSYNOPSIS, snprintfSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, snprintfDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------sprintf
        values.put(FUNCTION, "sprintf");
        values.put(FUNCTIONAME, sprintfName.toString());
        values.put(FUNCTIONSYNOPSIS, sprintfSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, sprintfDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------sscanf
        values.put(FUNCTION, "sscanf");
        values.put(FUNCTIONAME, sscanfName.toString());
        values.put(FUNCTIONSYNOPSIS, sscanfSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, sscanfDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------tmpfile
        values.put(FUNCTION, "tmpfile");
        values.put(FUNCTIONAME, tmpfileName.toString());
        values.put(FUNCTIONSYNOPSIS, tmpfileSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, tmpfileDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------tmpnam
        values.put(FUNCTION, "tmpnam");
        values.put(FUNCTIONAME, tmpnamName.toString());
        values.put(FUNCTIONSYNOPSIS, tmpnamSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, tmpnamDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------ungetc
        values.put(FUNCTION, "ungetc");
        values.put(FUNCTIONAME, ungetcName.toString());
        values.put(FUNCTIONSYNOPSIS, ungetcSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, ungetcDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------vfprintf
        values.put(FUNCTION, "vfprintf");
        values.put(FUNCTIONAME, vfprintfName.toString());
        values.put(FUNCTIONSYNOPSIS, vfprintfSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, vfprintfDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------vfscanf
        values.put(FUNCTION, "vfscanf");
        values.put(FUNCTIONAME, vfscanfName.toString());
        values.put(FUNCTIONSYNOPSIS, vfscanfSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, vfscanfDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------vprintf
        values.put(FUNCTION, "vprintf");
        values.put(FUNCTIONAME, vprintfName.toString());
        values.put(FUNCTIONSYNOPSIS, vprintfSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, vprintfDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------vscanf
        values.put(FUNCTION, "vscanf");
        values.put(FUNCTIONAME, vscanfName.toString());
        values.put(FUNCTIONSYNOPSIS, vscanfSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, vscanfDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------vsnprintf
        values.put(FUNCTION, "vsnprintf");
        values.put(FUNCTIONAME, vsnprintfName.toString());
        values.put(FUNCTIONSYNOPSIS, vsnprintfSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, vsnprintfDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------vsprintf
        values.put(FUNCTION, "vsprintf");
        values.put(FUNCTIONAME, vsprintfName.toString());
        values.put(FUNCTIONSYNOPSIS, vsprintfSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, vsprintfDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------vsscanf
        values.put(FUNCTION, "vsscanf");
        values.put(FUNCTIONAME, vsscanfName.toString());
        values.put(FUNCTIONSYNOPSIS, vsscanfSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, vsscanfDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------abort
        values.put(FUNCTION, "abort");
        values.put(FUNCTIONAME, abortName.toString());
        values.put(FUNCTIONSYNOPSIS, abortSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, abortDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------abs
        values.put(FUNCTION, "abs");
        values.put(FUNCTIONAME, absName.toString());
        values.put(FUNCTIONSYNOPSIS, absSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, absDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------atexit
        values.put(FUNCTION, "atexit");
        values.put(FUNCTIONAME, atexitName.toString());
        values.put(FUNCTIONSYNOPSIS, atexitSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, atexitDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------atof
        values.put(FUNCTION, "atof");
        values.put(FUNCTIONAME, atofName.toString());
        values.put(FUNCTIONSYNOPSIS, atofSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, atofDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------atoi
        values.put(FUNCTION, "atoi");
        values.put(FUNCTIONAME, atoiName.toString());
        values.put(FUNCTIONSYNOPSIS, atoiSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, atoiDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------atol
        values.put(FUNCTION, "atol");
        values.put(FUNCTIONAME, atolName.toString());
        values.put(FUNCTIONSYNOPSIS, atolSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, atolDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------atoll
        values.put(FUNCTION, "atoll");
        values.put(FUNCTIONAME, atollName.toString());
        values.put(FUNCTIONSYNOPSIS, atollSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, atollDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------bsearch
        values.put(FUNCTION, "bsearch");
        values.put(FUNCTIONAME, bsearchName.toString());
        values.put(FUNCTIONSYNOPSIS, bsearchSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, bsearchDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------calloc
        values.put(FUNCTION, "calloc");
        values.put(FUNCTIONAME, callocName.toString());
        values.put(FUNCTIONSYNOPSIS, callocSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, callocDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------div
        values.put(FUNCTION, "div");
        values.put(FUNCTIONAME, divName.toString());
        values.put(FUNCTIONSYNOPSIS, divSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, divDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------drand48
        values.put(FUNCTION, "drand48");
        values.put(FUNCTIONAME, drand48Name.toString());
        values.put(FUNCTIONSYNOPSIS, drand48Synopsis.toString());
        values.put(FUNCTIONDESCRIPTION, drand48Description.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------exit
        values.put(FUNCTION, "exit");
        values.put(FUNCTIONAME, exitName.toString());
        values.put(FUNCTIONSYNOPSIS, exitSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, exitDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------free
        values.put(FUNCTION, "free");
        values.put(FUNCTIONAME, freeName.toString());
        values.put(FUNCTIONSYNOPSIS, freeSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, freeDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------getenv
        values.put(FUNCTION, "getenv");
        values.put(FUNCTIONAME, getenvName.toString());
        values.put(FUNCTIONSYNOPSIS, getenvSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, getenvDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------labs
        values.put(FUNCTION, "labs");
        values.put(FUNCTIONAME, labsName.toString());
        values.put(FUNCTIONSYNOPSIS, labsSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, labsDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------ldiv
        values.put(FUNCTION, "ldiv");
        values.put(FUNCTIONAME, ldivName.toString());
        values.put(FUNCTIONSYNOPSIS, ldivSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, ldivDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------llabs
        values.put(FUNCTION, "llabs");
        values.put(FUNCTIONAME, llabsName.toString());
        values.put(FUNCTIONSYNOPSIS, llabsSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, llabsDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------lldiv
        values.put(FUNCTION, "lldiv");
        values.put(FUNCTIONAME, lldivName.toString());
        values.put(FUNCTIONSYNOPSIS, lldivSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, lldivDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------malloc
        values.put(FUNCTION, "malloc");
        values.put(FUNCTIONAME, mallocName.toString());
        values.put(FUNCTIONSYNOPSIS, mallocSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, mallocDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------mblen
        values.put(FUNCTION, "mblen");
        values.put(FUNCTIONAME, mblenName.toString());
        values.put(FUNCTIONSYNOPSIS, mblenSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, mblenDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------mbstowcs
        values.put(FUNCTION, "mbstowcs");
        values.put(FUNCTIONAME, mbstowcsName.toString());
        values.put(FUNCTIONSYNOPSIS, mbstowcsSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, mbstowcsDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------mbtowc
        values.put(FUNCTION, "mbtowc");
        values.put(FUNCTIONAME, mbtowcName.toString());
        values.put(FUNCTIONSYNOPSIS, mbtowcSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, mbtowcDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------qsort
        values.put(FUNCTION, "qsort");
        values.put(FUNCTIONAME, qsortName.toString());
        values.put(FUNCTIONSYNOPSIS, qsortSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, qsortDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------rand
        values.put(FUNCTION, "rand");
        values.put(FUNCTIONAME, randName.toString());
        values.put(FUNCTIONSYNOPSIS, randSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, randDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------realloc
        values.put(FUNCTION, "realloc");
        values.put(FUNCTIONAME, reallocName.toString());
        values.put(FUNCTIONSYNOPSIS, reallocSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, reallocDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------srand
        values.put(FUNCTION, "srand");
        values.put(FUNCTIONAME, srandName.toString());
        values.put(FUNCTIONSYNOPSIS, srandSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, srandDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------srand48
        values.put(FUNCTION, "srand48");
        values.put(FUNCTIONAME, srand48Name.toString());
        values.put(FUNCTIONSYNOPSIS, srand48Synopsis.toString());
        values.put(FUNCTIONDESCRIPTION, srand48Description.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------strtod
        values.put(FUNCTION, "strtod");
        values.put(FUNCTIONAME, strtodName.toString());
        values.put(FUNCTIONSYNOPSIS, strtodSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, strtodDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------strtof
        values.put(FUNCTION, "strtof");
        values.put(FUNCTIONAME, strtofName.toString());
        values.put(FUNCTIONSYNOPSIS, strtofSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, strtofDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------strtol
        values.put(FUNCTION, "strtol");
        values.put(FUNCTIONAME, strtolName.toString());
        values.put(FUNCTIONSYNOPSIS, strtolSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, strtolDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------strtold
        values.put(FUNCTION, "strtold");
        values.put(FUNCTIONAME, strtoldName.toString());
        values.put(FUNCTIONSYNOPSIS, strtoldSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, strtoldDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------strtoll
        values.put(FUNCTION, "strtoll");
        values.put(FUNCTIONAME, strtollName.toString());
        values.put(FUNCTIONSYNOPSIS, strtollSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, strtollDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------strtoul
        values.put(FUNCTION, "strtoul");
        values.put(FUNCTIONAME, strtoulName.toString());
        values.put(FUNCTIONSYNOPSIS, strtoulSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, strtoulDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------strtoull
        values.put(FUNCTION, "strtoull");
        values.put(FUNCTIONAME, strtoullName.toString());
        values.put(FUNCTIONSYNOPSIS, strtoullSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, strtoullDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------system
        values.put(FUNCTION, "system");
        values.put(FUNCTIONAME, systemName.toString());
        values.put(FUNCTIONSYNOPSIS, systemSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, systemDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------wcstombs
        values.put(FUNCTION, "wcstombs");
        values.put(FUNCTIONAME, wcstombsName.toString());
        values.put(FUNCTIONSYNOPSIS, wcstombsSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, wcstombsDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------wctomb
        values.put(FUNCTION, "wctomb");
        values.put(FUNCTIONAME, wctombName.toString());
        values.put(FUNCTIONSYNOPSIS, wctombSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, wctombDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------memchr
        values.put(FUNCTION, "memchr");
        values.put(FUNCTIONAME, memchrName.toString());
        values.put(FUNCTIONSYNOPSIS, memchrSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, memchrDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------memcmp
        values.put(FUNCTION, "memcmp");
        values.put(FUNCTIONAME, memcmpName.toString());
        values.put(FUNCTIONSYNOPSIS, memcmpSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, memcmpDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------memcpy
        values.put(FUNCTION, "memcpy");
        values.put(FUNCTIONAME, memcpyName.toString());
        values.put(FUNCTIONSYNOPSIS, memcpySynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, memcpyDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------memmove
        values.put(FUNCTION, "memmove");
        values.put(FUNCTIONAME, memmoveName.toString());
        values.put(FUNCTIONSYNOPSIS, memmoveSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, memmoveDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------memset
        values.put(FUNCTION, "memset");
        values.put(FUNCTIONAME, memsetName.toString());
        values.put(FUNCTIONSYNOPSIS, memsetSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, memsetDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------strcat
        values.put(FUNCTION, "strcat");
        values.put(FUNCTIONAME, strcatName.toString());
        values.put(FUNCTIONSYNOPSIS, strcatSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, strcatDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------strchr
        values.put(FUNCTION, "strchr");
        values.put(FUNCTIONAME, strchrName.toString());
        values.put(FUNCTIONSYNOPSIS, strchrSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, strchrDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------strcmp
        values.put(FUNCTION, "strcmp");
        values.put(FUNCTIONAME, strcmpName.toString());
        values.put(FUNCTIONSYNOPSIS, strcmpSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, strcmpDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------strcoll
        values.put(FUNCTION, "strcoll");
        values.put(FUNCTIONAME, strcollName.toString());
        values.put(FUNCTIONSYNOPSIS, strcollSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, strcollDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------strcpy
        values.put(FUNCTION, "strcpy");
        values.put(FUNCTIONAME, strcpyName.toString());
        values.put(FUNCTIONSYNOPSIS, strcpySynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, strcpyDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------strcspn
        values.put(FUNCTION, "strcspn");
        values.put(FUNCTIONAME, strcspnName.toString());
        values.put(FUNCTIONSYNOPSIS, strcspnSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, strcspnDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------strerror
        values.put(FUNCTION, "strerror");
        values.put(FUNCTIONAME, strerrorName.toString());
        values.put(FUNCTIONSYNOPSIS, strerrorSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, strerrorDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------strlen
        values.put(FUNCTION, "strlen");
        values.put(FUNCTIONAME, strlenName.toString());
        values.put(FUNCTIONSYNOPSIS, strlenSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, strlenDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------strncat
        values.put(FUNCTION, "strncat");
        values.put(FUNCTIONAME, strncatName.toString());
        values.put(FUNCTIONSYNOPSIS, strncatSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, strncatDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------strncmp
        values.put(FUNCTION, "strncmp");
        values.put(FUNCTIONAME, strncmpName.toString());
        values.put(FUNCTIONSYNOPSIS, strncmpSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, strncmpDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------strncpy
        values.put(FUNCTION, "strncpy");
        values.put(FUNCTIONAME, strncpyName.toString());
        values.put(FUNCTIONSYNOPSIS, strncpySynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, strncpyDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------strpbrk
        values.put(FUNCTION, "strpbrk");
        values.put(FUNCTIONAME, strpbrkName.toString());
        values.put(FUNCTIONSYNOPSIS, strpbrkSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, strpbrkDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------strrchr
        values.put(FUNCTION, "strrchr");
        values.put(FUNCTIONAME, strrchrName.toString());
        values.put(FUNCTIONSYNOPSIS, strrchrSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, strrchrDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------strspn
        values.put(FUNCTION, "strspn");
        values.put(FUNCTIONAME, strspnName.toString());
        values.put(FUNCTIONSYNOPSIS, strspnSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, strspnDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------strstr
        values.put(FUNCTION, "strstr");
        values.put(FUNCTIONAME, strstrName.toString());
        values.put(FUNCTIONSYNOPSIS, strstrSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, strstrDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------strtok
        values.put(FUNCTION, "strtok");
        values.put(FUNCTIONAME, strtokName.toString());
        values.put(FUNCTIONSYNOPSIS, strtokSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, strtokDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------strxfrm
        values.put(FUNCTION, "strxfrm");
        values.put(FUNCTIONAME, strxfrmName.toString());
        values.put(FUNCTIONSYNOPSIS, strxfrmSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, strxfrmDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------asctime
        values.put(FUNCTION, "asctime");
        values.put(FUNCTIONAME, asctimeName.toString());
        values.put(FUNCTIONSYNOPSIS, asctimeSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, asctimeDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------clock
        values.put(FUNCTION, "clock");
        values.put(FUNCTIONAME, clockName.toString());
        values.put(FUNCTIONSYNOPSIS, clockSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, clockDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------ctime
        values.put(FUNCTION, "ctime");
        values.put(FUNCTIONAME, ctimeName.toString());
        values.put(FUNCTIONSYNOPSIS, ctimeSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, ctimeDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------difftime
        values.put(FUNCTION, "difftime");
        values.put(FUNCTIONAME, difftimeName.toString());
        values.put(FUNCTIONSYNOPSIS, difftimeSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, difftimeDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------gmtime
        values.put(FUNCTION, "gmtime");
        values.put(FUNCTIONAME, gmtimeName.toString());
        values.put(FUNCTIONSYNOPSIS, gmtimeSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, gmtimeDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------localtime
        values.put(FUNCTION, "localtime");
        values.put(FUNCTIONAME, localtimeName.toString());
        values.put(FUNCTIONSYNOPSIS, localtimeSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, localtimeDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------mktime
        values.put(FUNCTION, "mktime");
        values.put(FUNCTIONAME, mktimeName.toString());
        values.put(FUNCTIONSYNOPSIS, mktimeSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, mktimeDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------strftime
        values.put(FUNCTION, "strftime");
        values.put(FUNCTIONAME, strftimeName.toString());
        values.put(FUNCTIONSYNOPSIS, strftimeSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, strftimeDescription.toString());
        db.insert(DETAILSTABLE, null, values);
        //--------time
        values.put(FUNCTION, "time");
        values.put(FUNCTIONAME, timeName.toString());
        values.put(FUNCTIONSYNOPSIS, timeSynopsis.toString());
        values.put(FUNCTIONDESCRIPTION, timeDescription.toString());
        db.insert(DETAILSTABLE, null, values);

        return;

    }


    public ArrayList<String> displayAllFunctions(){

        ArrayList<String> myArray= new ArrayList<String>();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cur = db.rawQuery("SELECT * FROM "+FUNCTIONSTABLE, null);
        cur.moveToFirst();
        while(cur.isAfterLast()==false){
            myArray.add(cur.getString(cur.getColumnIndex(FUNCTION)));
            cur.moveToNext();
        }
        return myArray;
    }



    public ArrayList<String> displayFunctions(String keyWord){

        ArrayList<String> myArray= new ArrayList<String>();
        String whereClause = LIBRARY + " = ?";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cur = db.query(FUNCTIONSTABLE, new String[]{FUNCTION}, whereClause, new String[]{keyWord}, null, null, null);
        cur.moveToFirst();
        if(cur.getCount() > 0){
            while(cur.isAfterLast()==false){
                myArray.add(cur.getString(cur.getColumnIndex(FUNCTION)));
                cur.moveToNext();
            }
        }
        else{
            whereClause = FUNCTION + " = ?";
            cur = db.query(FUNCTIONSTABLE, new String[]{FUNCTION}, whereClause, new String[]{keyWord}, null, null, null);
            cur.moveToFirst();
            while(cur.isAfterLast()==false){
                myArray.add(cur.getString(cur.getColumnIndex(FUNCTION)));
                cur.moveToNext();
            }
        }
        return myArray;
    }



    public String displayFunctionName(String function){
        String whereClause = FUNCTION + " = ?";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cur = db.query(DETAILSTABLE, new String[]{FUNCTIONAME}, whereClause, new String[]{function}, null, null, null);
        cur.moveToFirst();
        return cur.getString(cur.getColumnIndex(FUNCTIONAME));

    }

    public String displayFunctionSynopsis(String function){
        String whereClause = FUNCTION + " = ?";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cur = db.query(DETAILSTABLE, new String[]{FUNCTIONSYNOPSIS}, whereClause, new String[]{function}, null, null, null);
        cur.moveToFirst();
        return cur.getString(cur.getColumnIndex(FUNCTIONSYNOPSIS));
    }

    public String displayFunctionDescription(String function){
        String whereClause = FUNCTION + " = ?";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cur = db.query(DETAILSTABLE, new String[]{FUNCTIONDESCRIPTION}, whereClause, new String[]{function}, null, null, null);
        cur.moveToFirst();
        return cur.getString(cur.getColumnIndex(FUNCTIONDESCRIPTION));
    }


    public boolean checkEmptyTable(){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cur = db.rawQuery("SELECT * FROM "+ FUNCTIONSTABLE, null);
        cur.moveToFirst();
        if(cur.getCount() > 0){
            return false;
        }
        return true;
    }


    public void setupLibraries(){
        ctypeFunctions = new ArrayList<String>();
        ctypeFunctions.add("isalnum");
        ctypeFunctions.add("isalpha");
        ctypeFunctions.add("isblank");
        ctypeFunctions.add("iscntrl");
        ctypeFunctions.add("isdigit");
        ctypeFunctions.add("isgraph");
        ctypeFunctions.add("islower");
        ctypeFunctions.add("isprint");
        ctypeFunctions.add("ispunct");
        ctypeFunctions.add("isspace");
        ctypeFunctions.add("isupper");
        ctypeFunctions.add("isxdigit");
        ctypeFunctions.add("tolower");
        ctypeFunctions.add("toupper");
        localeFunctions = new ArrayList<String>();
        localeFunctions.add("localeconv");
        localeFunctions.add("setlocale");
        mathFunctions = new ArrayList<String>();
        mathFunctions.add("acos");
        mathFunctions.add("acosh");
        mathFunctions.add("asin");
        mathFunctions.add("asinh");
        mathFunctions.add("atan");
        mathFunctions.add("atan2");
        mathFunctions.add("atanh");
        mathFunctions.add("ceil");
        mathFunctions.add("copysign");
        mathFunctions.add("cos");
        mathFunctions.add("cosh");
        mathFunctions.add("erf");
        mathFunctions.add("erfc");
        mathFunctions.add("exp");
        mathFunctions.add("exp2");
        mathFunctions.add("expm1");
        mathFunctions.add("fabs");
        mathFunctions.add("fdim");
        mathFunctions.add("floor");
        mathFunctions.add("fma");
        mathFunctions.add("fmax");
        mathFunctions.add("fmin");
        mathFunctions.add("fmod");
        mathFunctions.add("fpclassify");
        mathFunctions.add("frexp");
        mathFunctions.add("ilogb");
        mathFunctions.add("isfinite");
        mathFunctions.add("isgreater");
        mathFunctions.add("isgreaterequal");
        mathFunctions.add("isinf");
        mathFunctions.add("isless");
        mathFunctions.add("islessequal");
        mathFunctions.add("islessgreater");
        mathFunctions.add("isnan");
        mathFunctions.add("isnormal");
        mathFunctions.add("isunordered");
        mathFunctions.add("ldexp");
        mathFunctions.add("llrint");
        mathFunctions.add("llround");
        mathFunctions.add("log");
        mathFunctions.add("log10");
        mathFunctions.add("log1p");
        mathFunctions.add("log2");
        mathFunctions.add("logb");
        mathFunctions.add("lrint");
        mathFunctions.add("lround");
        mathFunctions.add("modf");
        mathFunctions.add("nearbyint");
        mathFunctions.add("pow");
        mathFunctions.add("remainder");
        mathFunctions.add("remquo");
        mathFunctions.add("rint");
        mathFunctions.add("round");
        mathFunctions.add("scalbln");
        mathFunctions.add("scalbn");
        mathFunctions.add("signbit");
        mathFunctions.add("sin");
        mathFunctions.add("sinh");
        mathFunctions.add("sqrt");
        mathFunctions.add("tan");
        mathFunctions.add("tgamma");
        mathFunctions.add("trunc");
        setjmpFunctions = new ArrayList<String>();
        setjmpFunctions.add("longjmp");
        setjmpFunctions.add("setjmp");
        signalFunctions = new ArrayList<String>();
        signalFunctions.add("raise");
        signalFunctions.add("signal");
        stdargFunctions = new ArrayList<String>();
        stdargFunctions.add("stdarg");
        stdargFunctions.add("va_arg");
        stdargFunctions.add("va_copy");
        stdargFunctions.add("va_end");
        stdargFunctions.add("va_start");
        stdioFunctions = new ArrayList<String>();
        stdioFunctions.add("clearerr");
        stdioFunctions.add("fclose");
        stdioFunctions.add("feof");
        stdioFunctions.add("ferror");
        stdioFunctions.add("fflush");
        stdioFunctions.add("fgetc");
        stdioFunctions.add("fgetpos");
        stdioFunctions.add("fgets");
        stdioFunctions.add("fopen");
        stdioFunctions.add("fprintf");
        stdioFunctions.add("fputc");
        stdioFunctions.add("fputs");
        stdioFunctions.add("fread");
        stdioFunctions.add("freopen");
        stdioFunctions.add("fscanf");
        stdioFunctions.add("fseek");
        stdioFunctions.add("fsetpos");
        stdioFunctions.add("ftell");
        stdioFunctions.add("fwrite");
        stdioFunctions.add("getc");
        stdioFunctions.add("getchar");
        stdioFunctions.add("gets");
        stdioFunctions.add("perror");
        stdioFunctions.add("printf");
        stdioFunctions.add("putc");
        stdioFunctions.add("putchar");
        stdioFunctions.add("puts");
        stdioFunctions.add("remove");
        stdioFunctions.add("rewind");
        stdioFunctions.add("scanf");
        stdioFunctions.add("setbuf");
        stdioFunctions.add("setvbuf");
        stdioFunctions.add("snprintf");
        stdioFunctions.add("sprintf");
        stdioFunctions.add("sscanf");
        stdioFunctions.add("tmpfile");
        stdioFunctions.add("tmpnam");
        stdioFunctions.add("ungetc");
        stdioFunctions.add("vfprintf");
        stdioFunctions.add("vfscanf");
        stdioFunctions.add("vprintf");
        stdioFunctions.add("vscanf");
        stdioFunctions.add("vsnprintf");
        stdioFunctions.add("vsprintf");
        stdioFunctions.add("vsscanf");
        stdlibFunctions = new ArrayList<String>();
        stdlibFunctions.add("abort");
        stdlibFunctions.add("abs");
        stdlibFunctions.add("atexit");
        stdlibFunctions.add("atof");
        stdlibFunctions.add("atoi");
        stdlibFunctions.add("atol");
        stdlibFunctions.add("atoll");
        stdlibFunctions.add("bsearch");
        stdlibFunctions.add("calloc");
        stdlibFunctions.add("div");
        stdlibFunctions.add("drand48");
        stdlibFunctions.add("exit");
        stdlibFunctions.add("free");
        stdlibFunctions.add("getenv");
        stdlibFunctions.add("labs");
        stdlibFunctions.add("ldiv");
        stdlibFunctions.add("llabs");
        stdlibFunctions.add("lldiv");
        stdlibFunctions.add("malloc");
        stdlibFunctions.add("mblen");
        stdlibFunctions.add("mbstowcs");
        stdlibFunctions.add("mbtowc");
        stdlibFunctions.add("qsort");
        stdlibFunctions.add("rand");
        stdlibFunctions.add("realloc");
        stdlibFunctions.add("srand");
        stdlibFunctions.add("srand48");
        stdlibFunctions.add("strtod");
        stdlibFunctions.add("strtof");
        stdlibFunctions.add("strtol");
        stdlibFunctions.add("strtold");
        stdlibFunctions.add("strtoll");
        stdlibFunctions.add("strtoul");
        stdlibFunctions.add("strtoull");
        stdlibFunctions.add("system");
        stdlibFunctions.add("wcstombs");
        stdlibFunctions.add("wctomb");
        stringFunctions = new ArrayList<String>();
        stringFunctions.add("memchr");
        stringFunctions.add("memcmp");
        stringFunctions.add("memcpy");
        stringFunctions.add("memmove");
        stringFunctions.add("memset");
        stringFunctions.add("strcat");
        stringFunctions.add("strchr");
        stringFunctions.add("strcmp");
        stringFunctions.add("strcoll");
        stringFunctions.add("strcpy");
        stringFunctions.add("strcspn");
        stringFunctions.add("strerror");
        stringFunctions.add("strlen");
        stringFunctions.add("strncat");
        stringFunctions.add("strncmp");
        stringFunctions.add("strncpy");
        stringFunctions.add("strpbrk");
        stringFunctions.add("strrchr");
        stringFunctions.add("strspn");
        stringFunctions.add("strstr");
        stringFunctions.add("strtok");
        stringFunctions.add("strxfrm");
        timeFunctions = new ArrayList<String>();
        timeFunctions.add("asctime");
        timeFunctions.add("clock");
        timeFunctions.add("ctime");
        timeFunctions.add("difftime");
        timeFunctions.add("gmtime");
        timeFunctions.add("localtime");
        timeFunctions.add("mktime");
        timeFunctions.add("strftime");
        timeFunctions.add("time");
    }

    public void setupFunctionData(){

        assertName = ("assert - verifies if an assumption made by the program is true");
        assertSynopsis = ("#include<assert.h>\n" + "void assert(int expression)\n");
        assertDescription = ("assert is a macro which can be used to verify assumptions made by the program and print a diagnostic message if this assumption is false" +
                "\n" + "This is a maccro and not a function, which can be used to add diagnostics in your C program.");
        isalnumName = "isalnum - checks if character is alphanumeric";
        isalnumSynopsis = ("#include <ctype.h>" + "\n" + "int isalnum(int c);");
        isalnumDescription = ("These functions check whether c, which must have the value of an unsigned char or *EOF\\*, falls into a certain character class according to the current locale.\n" +
                "\n" + "isalnum() checks for an alphanumeric character; it is equivalent to *(isalpha(\\*c*) || isdigit(\\*c*))\\*.\n");
        isalphaName = ("isalpha - checks if character is an alphabetic letter");
        isalphaSynopsis = ("#include <ctype.h>" + "\n" + "int isalpha(int c);");
        isalphaDescription = ("Checks if the given character is an alphabetic letter.");
        isblankName = ("isblank - checks if character is blank");
        isblankSynopsis = ("#include <ctype.h>" + "\n" + "int isblank(int c);");
        isblankDescription = ("Checks if the given character is blank, which means either a space ' ' or a tab '\\t'.");
        iscntrlName = ("iscntrl - checks if character is control");
        iscntrlSynopsis = ("#include <ctype.h>" + "\n" + "int iscntrl(int c);");
        iscntrlDescription = ("Checks if the given character is a control character. A control character is a character that is not displayed on the screen when printed. This is the opposite of a printable character (see isprint()). An example of a control character is. An example of a printable character is 'a'.");
        isdigitName = ("isdigit - checks if character is a digit");
        isdigitSynopsis = ("#include <ctype.h>" + "\n" + "int isdigit(int c);");
        isdigitDescription = ("Checks if the given character is a numeric digit. Note that, per the ASCII table, the character '5' and the integer 5 are different and only the first one constitutes a numeric digit.");
        isgraphName = ("isgraph - checks if character is graphical");
        isgraphSynopsis = ("#include <ctype.h>" + "\n" + "int isgraph(int c);");
        isgraphDescription = ("Checks if the given character has a graphical representation. The characters with graphical representation are all those given by isprint() except the space character ' '.");
        islowerName = ("islower - checks if character is lowercase");
        islowerSynopsis = ("#include <ctype.h>" + "\n" + "int islower(int c);");
        islowerDescription = ("Checks if the given character is a lowercase alphabetic letter.");
        isprintName = ("isprint - checks if character is printable");
        isprintSynopsis = ("#include <ctype.h>" + "\n" + "int isprint(int c);");
        isprintDescription = ("Checks if the given character is a printable character. A printable character is a character that is displayed on the screen when printed. This is the opposite of a control character (see iscntrl())."
                + "An example of a printable character is 'a'. An example of a control character is the newline character '\\n'.");
        ispunctName = ("ispunct - checks if character is a punctuation mark");
        ispunctSynopsis = ("#include <ctype.h>" + "\n" + "int ispunct(int c);");
        ispunctDescription = ("Checks if the given character is a punctuation character. C considers every graphic character (see isgraph()) that is not alphanumeric to be a punctuation.");
        isspaceName = ("isspace - checks if character is a white-space");
        isspaceSynopsis = ("#include <ctype.h>" + "\n" + "int isspace(int c);");
        isspaceDescription = ("Checks if the given character is a white-space character. C considers white-space characters to be ' ','\\n',\\t,'\\v',\\f,'\\r'.");
        isupperName = ("isupper - checks if character is uppercase");
        isupperSynopsis = ("#include <ctype.h>" + "\n" + "int isupper(int c);");
        isupperDescription = ("Checks if the given character is an uppercase alphabetic letter.");
        isxdigitName = ("isxdigit - checks if character is hexadecimal");
        isxdigitSynopsis = ("#include <ctype.h>" + "\n" + "int isxdigit(int c);");
        isxdigitDescription = ("Checks if the given character is a hexadecimal digit." + "\n" + "Hexadecimal digits are: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'.");
        tolowerName = ("tolower - converts letter to lowercase");
        tolowerSynopsis = ("#include <ctype.h>\n" + "\n" + "int toupper(int c);" + "\n" + "int tolower(int c);");
        tolowerDescription = ("Converts an uppercase letter to lowercase.");
        toupperName = ("toupper - converts letter to uppercase");
        toupperSynopsis = ("#include <ctype.h>\n" + "\n" + "int toupper(int c);" + "\n" + "int tolower(int c);");
        toupperDescription = ("Converts a lowercase letter to uppercase.");
        localeconvName = ("localeconv - get numeric formatting information");
        localeconvSynopsis = ("#include <locale.h>\n" + "struct  *localeconv lconv(void);");
        localeconvDescription = ("The *localeconv() function returns a pointer to a struct lconv for the current locale. This structure is shown in locale(7), and contains all values associated with the locale categories *LC_NUMERIC\\* and *LC_MONETARY\\*. Programs may also use the functions printf(3) and strfmon(3), which behave according to the actual locale in use.");
        setlocaleName = ("setlocale - set the current locale");
        setlocaleSynopsis = ("#include <locale.h>\n" + "char * setlocale(int category, const char * locale);");
        setlocaleDescription = ("The setlocale() function is used to set or query the program’s current locale." +
                "\n" + "If locale is not NULL, the program’s current locale is modified according to the arguments. The argument category determines which parts of the program’s current locale should be modified." +
                "\n" + "LC_ALL for all of the locale." +
                "\n" + "LC_COLLATE for regular expression matching (it determines the meaning of range expressions and equivalence classes) and string collation." +
                "\n" + "LC_CTYPE for regular expression matching, character classification, conversion, case-sensitive comparison, and wide character functions." +
                "\n" + "LC_MESSAGES for localizable natural-language messages." +
                "\n" + "LC_MONETARY for monetary formatting." +
                "\n" + "LC_NUMERIC for number formatting (such as the decimal point and the thousands separator)." +
                "\n" + "LC_TIME for time and date formatting." +
                "\n" + "The argument locale is a pointer to a character string containing the required setting of category. Such a string is either a well-known constant like \"C\" or \"da_DK\" (see below), or an opaque string that was returned by another call of setlocale()." +
                "\n" + "If locale is \"\", each part of the locale that should be modified is set according to the environment variables. The details are implementation-dependent. For glibc, first (regardless of category), the environment variable LC_ALL is inspected, next the environment variable with the same name as the category (LC_COLLATE, LC_CTYPE, LC_MESSAGES, LC_MONETARY, LC_NUMERIC, LC_TIME) and finally the environment variable LANG. The first existing environment variable is used. If its value is not a valid locale specification, the locale is unchanged, and setlocale() returns NULL." +
                "\n" + "The locale \"C\" or \"POSIX\" is a portable locale; its LC_CTYPE part corresponds to the 7-bit ASCII character set." +
                "\n" + "A locale name is typically of the form language[_territory][.codeset][@modifier], where language is an ISO 639 language code, _territory is an ISO 3166 country code, and codeset is a character set or encoding identifier like ISO-8859-1 or UTF-8. For a list of all supported locales, try \"locale -a\", cf. locale(1)." +
                "\n" + "If locale is NULL, the current locale is only queried, not modified." +
                "\n" + "On startup of the main program, the portable \"C\" locale is selected as default. A program may be made portable to all locales by calling: setlocale(LC_ALL, \"\"); after program initialization, by using the values returned from a localeconv(3) call for locale-dependent information, by using the multibyte and wide character functions for text processing if MB_CUR_MAX > 1, and by using strcoll(3), wcscoll(3) or strxfrm(3), wcsxfrm(3) to compare strings.");
        acosName = ("acos, acosf, acosl - arc cosine function");
        acosSynopsis = ("#include <math.h>\n" + "\n" + "double acos(double x);\n" + "float acosf(float x);\n" + "long double acosl(long double x);");
        acosDescription = ("The acos() function calculates the arc cosine of x; that is the value whose cosine is x.");
        acoshName = ("acosh, acoshf, acoshl - inverse hyperbolic cosine function");
        acoshSynopsis = ("#include <math.h>\n" + "\n" + "double acosh(double x);\n" + "float acoshf(float x);\n" + "long double acoshl(long double x);");
        acoshDescription = ("The acosh() function calculates the inverse hyperbolic cosine of x; that is the value whose hyperbolic cosine is x.");
        asinName = ("asin, asinf, asinl - arc sine function");
        asinSynopsis = ("#include <math.h>\n" + "\n" + "double asin(double x);\n" + "float asinf(float x);\n" + "long double asinl(long double x);");
        asinDescription = ("The asin() function calculates the principal value of the arc sine of x; that is the value whose sine is x.");
        asinhName = ("asinh, asinhf, asinhl - inverse hyperbolic sine function");
        asinhSynopsis = ("#include <math.h>\n" + "\n" + "double asinh(double x);");
        asinhDescription = ("The asinh() function calculates the inverse hyperbolic sine of x; that is the value whose hyperbolic sine is x.");
        atanName = ("atan, atanf, atanl - arc tangent function");
        atanSynopsis = ("#include <math.h>\n" + "\n" + "double atan(double x);");
        atanDescription = ("The atan() function calculates the principal value of the arc tangent of x; that is the value whose tangent is x.");
        atan2Name = ("atan2, atan2f, atan2l - arc tangent function of two variables");
        atan2Synopsis = ("#include <math.h>\n" + "\n" + "double atan2(double y, double x);");
        atan2Description = ("The atan2() function calculates the principal value of the arc tangent of y/x, using the signs of the two arguments to determine the quadrant of the result.");
        atanhName = ("atanh, atanhf, atanhl - inverse hyperbolic tangent function");
        atanhSynopsis = ("#include <math.h>\n" + "\n" + "double atanh(double x);");
        atanhDescription = ("The atanh() function calculates the inverse hyperbolic tangent of x; that is the value whose hyperbolic tangent is x.");



        ceilName = ("ceil - rounds up value");
        ceilSynopsis = ("#include <math.h>\n" + "\n" + "double ceil(double x);\n" + "\n" + "float ceilf(float x);\n" + "\n" + "long double ceill(long double x);\n");
        ceilDescription = ("Rounds x upward.");



        copysignName = ("copysign, copysignf, copysignl - copy sign of a number");
        copysignSynopsis = ("#include <math.h>\n" + "\n" + "double copysign(double x, double y);");
        copysignDescription = ("The copysign() functions return a value whose absolute value matches that of x, but whose sign bit matches that of y." + "\n" + "For example, copysign(42.0, -1.0) and copysign(-42.0, -1.0) both return -42.0.");
        cosName = ("cos - computes cosine");
        cosSynopsis = ("#include <math.h>\n" + "\n" + "double cos(double x);\n" + "float cosf(float x);\n" + "long double cosl(long double x);");
        cosDescription = ("Computes the cosine of the angle x in radians.");
        coshName = ("cosh, coshf, coshl - hyperbolic cosine function");
        coshSynopsis = ("#include <math.h>\n" + "\n" + "double cosh(double x);");
        coshDescription = ("The cosh() function returns the hyperbolic cosine of x, which is defined mathematically as: cosh(x) = (exp(x) + exp(-x)) / 2");
        erfName = ("erf, erff, erfl, - error function");
        erfSynopsis = ("#include <math.h>\n" + "\n" + "double erf(double x);");
        erfDescription = ("The erf() function returns the error function of x, defined as" + "\n" + "erf(x) = 2/sqrt(pi)\\* integral from 0 to x of exp(-t\\*t) dt");
        erfcName = ("erfc, erfcf, erfcl - complementary error function");
        erfcSynopsis = ("#include <math.h>\n" + "\n" + "double erfc(double x);");
        erfcDescription = ("The erfc() function returns the complementary error function of x, that is, 1.0 - erf(x).");
        expName = ("exp - computes exponential");
        expSynopsis = ("#include <math.h>\n" + "\n" + "double exp(double x);");
        expDescription = ("Computes the value of e raised to the x-th power.");
        exp2Name = ("exp2, exp2f, exp2l - base-2 exponential function");
        exp2Synopsis = ("#include <math.h>\n" + "\n" + "double exp2(double x);\n" + "float exp2f(float x);\n"+ "long double exp2l(long double x);");
        exp2Description = ("The exp2() function returns the value of 2 raised to the power of x.");
        expm1Name = ("expm1, expm1f, expm1l - exponential minus 1");
        expm1Synopsis = ("#include <math.h>\n" + "\n" + "double expm1(double x);\n"+ "float expm1f(float x);\n"+ "long double expm1l(long double x);");
        expm1Description = ("expm1(x) returns a value equivalent to exp(x) - 1 It is computed in a way that is accurate even if the value of x is near zero—a case where exp(x) - 1 would be inaccurate due to subtraction of two numbers that are nearly equal.");
        fabsName = ("fabs - computes absolute value");
        fabsSynopsis = ("#include <math.h>\n" + "\n" + "double fabs(double x);\n" + "\n" + "float fabsf(float x);\n" + "\n" + "long double fabsl(long double x);");
        fabsDescription = ("Computes the absolute value of x. The difference between fabs() and abs() is that fabs() is used for floats, while abs() is used for ints.");
        fdimName = ("fdim, fdimf, fdiml - positive difference");
        fdimSynopsis = ("#include <math.h>\n" + "\n" + "double fdim(double x, double y);\n" + "\n" + "float fdimf(float x, float y);\n" + "\n" + "long double fdiml(long double x, long double y);");
        fdimDescription = ("These functions return the positive difference, max(x-y,0), between their arguments.");
        floorName = ("floor - rounds down value");
        floorSynopsis = ("#include <math.h>\n" + "\n" + "double floor(double x);\n" + "\n" + "float floorf(float x);\n" + "\n" + "long double floorl(long double x);");
        floorDescription = ("Rounds x down.");
        fmaName = ("fma, fmaf, fmal - floating point multiply and add");
        fmaSynopsis = ("#include <math.h>\n" + "\n" + "double fma(double x, double y, double z);\n" + "\n" + "float fmaf(float x, float y, float z);\n" + "\n" + "long double fmal(long double x, long double y, long double z);");
        fmaDescription = ("The fma() function computes x \\* y + z. The result is rounded as one ternary operation according to the current rounding mode (see fenv(3)).");
        fmaxName = ("fmax, fmaxf, fmaxl - determine maximum of two floating-point numbers");


        fmaxSynopsis = ("#include <math.h>\n" + "\n" + "double fmax(double x, double y);\n" + "\n" + "float fmaxf(float x, float y);\n" + "\n" + "long double fmaxl(long double x, long double y);");
        fmaxDescription = ("These functions return the larger value of x and y.");
        fminName = ("fmin, fminf, fminl - determine minimum of two floating-point numbers");
        fminSynopsis = ("#include <math.h>\n" + "\n" + "double fmin(double x, double y);\n" + "\n" + "float fminf(float x, float y);\n" + "\n" + "long double fminl(long double x, long double y);");
        fminDescription = ("These functions the lesser value of x and y.");
        fmodName = ("fmod, fmodf, fmodl - floating-point remainder function");
        fmodSynopsis = ("#include <math.h>\n" + "\n" + "double fmod(double x, double y);\n" + "\n" + "float fmodf(float x, float y);\n" + "\n" + "long double fmodl(long double x, long double y);");
        fmodDescription = ("The fmod() function computes the floating-point remainder of dividing x by y. The return value is x - n \\* y, where n is the quotient of x / y, rounded toward zero to an integer.");
        fpclassifyName = ("fpclassify, isfinite, isnormal, isnan, isinf - floating-point classification macros");
        fpclassifySynopsis = ("#include <math.h>\n" + "\n" + "int fpclassify(x);");
        fpclassifyDescription = ("Floating point numbers can have special values, such as infinite or NaN. With the macro *fpclassify(\\*x\\*)\\* you can find out what type x is. The macro takes any floating-point expression as argument. The result is one of the following values:" +
                "\n" + "\\*FP_NAN\\* x is \"Not a Number\"." +
                "\n" + "\\*FP_INFINITE\\* x is either positive infinity or negative infinity." +
                "\n" + "\\*FP_ZERO\\* x is zero." +
                "\n" + "\\*FP_SUBNORMAL\\* x is too small to be represented in normalized format." +
                "\n" + "\\*FP_NORMAL\\* if nothing of the above is correct then it must be a normal floating-point number." +
                "\n" + "The other macros provide a short answer to some standard questions." +
                "\n" + "\\*isfinite(\\*_x_\\*)\\* returns a nonzero value if (fpclassify(x) != FP_NAN && fpclassify(x) != FP_INFINITE)" +
                "\n" + "\\*isnormal(\\*_x_\\*)\\* returns a nonzero value if (fpclassify(x) == FP_NORMAL)" +
                "\n" + "\\*isnan(\\*_x_\\*)\\* returns a nonzero value if (fpclassify(x) == FP_NAN)" +
                "\n" + "\\*isinf(\\*_x_\\*)\\* returns 1 if x is positive infinity, and -1 if x is negative infinity.");
        frexpName = ("frexp, frexpf, frexpl - convert floating-point number to fractional and integral components");
        frexpSynopsis = ("#include <math.h>\n" + "\n" + "double frexp(double x, int * exp);\n" + "\n" + "float frexpf(float x, int * exp);\n" + "\n" + "long double frexpl(long double x, int * exp);");
        frexpDescription = ("The frexp() function is used to split the number x into a normalized fraction and an exponent which is stored in exp.");
        ilogbName = ("ilogb, ilogbf, ilogbl - get integer exponent of a floating-point value");
        ilogbSynopsis = ("#include <math.h>\n" + "\n" + "int ilogb(double x);\n" + "\n" + "int ilogbf(float x);\n" + "\n" + "int ilogbl(long double x);");
        ilogbDescription = ("These functions return the exponent part of their argument as a signed integer. When no error occurs, these functions are equivalent to the corresponding logb(3) functions, cast to int.");
        isfiniteName = ("fpclassify, isfinite, isnormal, isnan, isinf - floating-point classification macros");
        isfiniteSynopsis = ("#include <math.h>\n" + "\n" + "int isfinite(x);");
        isfiniteDescription = ("Floating point numbers can have special values, such as infinite or NaN. With the macro *fpclassify(\\*x\\*)\\* you can find out what type x is. The macro takes any floating-point expression as argument. The result is one of the following values:" +
                "\n" + "\\*FP_NAN\\* x is \"Not a Number\"." +
                "\n" + "\\*FP_INFINITE\\* x is either positive infinity or negative infinity." +
                "\n" + "\\*FP_ZERO\\* x is zero.\n" + "\n" + "\\*FP_SUBNORMAL\\* x is too small to be represented in normalized format." +
                "\n" + "\\*FP_NORMAL\\* if nothing of the above is correct then it must be a normal floating-point number." +
                "\n" + "The other macros provide a short answer to some standard questions." +
                "\n" + "\\*isfinite(\\*_x_\\*)\\* returns a nonzero value if (fpclassify(x) != FP_NAN && fpclassify(x) != FP_INFINITE)" +
                "\n" + "\\*isnormal(\\*_x_\\*)\\* returns a nonzero value if (fpclassify(x) == FP_NORMAL)" +
                "\n" + "\\*isnan(\\*_x_\\*)\\* returns a nonzero value if (fpclassify(x) == FP_NAN)" +
                "\n" + "\\*isinf(\\*_x_\\*)\\* returns 1 if x is positive infinity, and -1 if x is negative infinity");
        isgreaterName = ("isgreater, isgreaterequal, isless, islessequal, islessgreater, isunordered - floating-point relational tests without exception for NaN");
        isgreaterSynopsis = ("#include <math.h>\n" + "\n" + "int isgreater(x, y);");
        isgreaterDescription = ("The normal relation operations (like *<\\*, \"less than\") will fail if one of the operands is NaN. This will cause an exception. To avoid this, C99 defines the macros listed below." +
                "\n" + "These macros are guaranteed to evaluate their arguments only once. The arguments must be of real floating-point type (note: do not pass integer values as arguments to these macros, since the arguments will not be promoted to real-floating types)." +
                "\n" + "isgreater() determines (x) > (y) without an exception if x or y is NaN." +
                "\n" + "isgreaterequal() determines (x) >= (y) without an exception if x or y is NaN." +
                "\n" + "isless() determines (x) < (y) without an exception if x or y is NaN." +
                "\n" + "islessequal() determines (x) ⇐ (y) without an exception if x or y is NaN." +
                "\n" + "islessgreater() determines (x) < (y) || (x) > (y) without an exception if x or y is NaN. This macro is not equivalent to x != y because that expression is true if x or y is NaN." +
                "\n" + "isunordered() determines whether its arguments are unordered, that is, whether at least one of the arguments is a NaN.");
        isgreaterequalName = ("isgreater, isgreaterequal, isless, islessequal, islessgreater, isunordered - floating-point relational tests without exception for NaN");
        isgreaterequalSynopsis = ("#include <math.h>\n" + "\n" + "int isgreaterequal(x, y);");
        isgreaterequalDescription = ("The normal relation operations (like *<\\*, \"less than\") will fail if one of the operands is NaN. This will cause an exception. To avoid this, C99 defines the macros listed below." +
                "\n" + "These macros are guaranteed to evaluate their arguments only once. The arguments must be of real floating-point type (note: do not pass integer values as arguments to these macros, since the arguments will not be promoted to real-floating types)." +
                "\n" + "isgreater() determines (x) > (y) without an exception if x or y is NaN." +
                "\n" + "isgreaterequal() determines (x) >= (y) without an exception if x or y is NaN." +
                "\n" + "isless() determines (x) < (y) without an exception if x or y is NaN." +
                "\n" + "islessequal() determines (x) ⇐ (y) without an exception if x or y is NaN." +
                "\n" + "islessgreater() determines (x) < (y) || (x) > (y) without an exception if x or y is NaN. This macro is not equivalent to x != y because that expression is true if x or y is NaN." +
                "\n" + "isunordered() determines whether its arguments are unordered, that is, whether at least one of the arguments is a NaN.");
        isinfName = ("fpclassify, isfinite, isnormal, isnan, isinf - floating-point classification macros");
        isinfSynopsis = ("#include <math.h>\n" + "\n" + "int isinf(x);");
        isinfDescription = ("Floating point numbers can have special values, such as infinite or NaN. With the macro *fpclassify(\\*x\\*)\\* you can find out what type x is. The macro takes any floating-point expression as argument. The result is one of the following values:" +
                "\n" + "\\*FP_NAN\\* x is \"Not a Number\"." + "\n" + "\\*FP_INFINITE\\* x is either positive infinity or negative infinity." +
                "\n" + "\\*FP_ZERO\\* x is zero." +
                "\n" + "\\*FP_SUBNORMAL\\* x is too small to be represented in normalized format." +
                "\n" + "\\*FP_NORMAL\\* if nothing of the above is correct then it must be a normal floating-point number." +
                "\n" + "The other macros provide a short answer to some standard questions." +
                "\n" + "\\*isfinite(\\*_x_\\*)\\* returns a nonzero value if (fpclassify(x) != FP_NAN && fpclassify(x) != FP_INFINITE)" +
                "\n" + "\\*isnormal(\\*_x_\\*)\\* returns a nonzero value if (fpclassify(x) == FP_NORMAL)" +
                "\n" + "\\*isnan(\\*_x_\\*)\\* returns a nonzero value if (fpclassify(x) == FP_NAN)" + "\n" + "\\*isinf(\\*_x_\\*)\\* returns 1 if x is positive infinity, and -1 if x is negative infinity.");
        islessName = ("isgreater, isgreaterequal, isless, islessequal, islessgreater, isunordered - floating-point relational tests without exception for NaN");
        islessSynopsis = ("#include <math.h>\n" + "\n" + "int isless(x, y);");
        islessDescription = ("The normal relation operations (like *<\\*, \"less than\") will fail if one of the operands is NaN. This will cause an exception. To avoid this, C99 defines the macros listed below." +
                "\n" + "These macros are guaranteed to evaluate their arguments only once. The arguments must be of real floating-point type (note: do not pass integer values as arguments to these macros, since the arguments will not be promoted to real-floating types)." +
                "\n" + "isgreater() determines (x) > (y) without an exception if x or y is NaN." + "\n" + "isgreaterequal() determines (x) >= (y) without an exception if x or y is NaN." +
                "\n" + "isless() determines (x) < (y) without an exception if x or y is NaN." + "\n" + "islessequal() determines (x) ⇐ (y) without an exception if x or y is NaN." +
                "\n" + "islessgreater() determines (x) < (y) || (x) > (y) without an exception if x or y is NaN. This macro is not equivalent to x != y because that expression is true if x or y is NaN." +
                "\n" + "isunordered() determines whether its arguments are unordered, that is, whether at least one of the arguments is a NaN.");
        islessequalName = ("isgreater, isgreaterequal, isless, islessequal, islessgreater, isunordered - floating-point relational tests without exception for NaN");
        islessequalSynopsis = ("#include <math.h>\n" + "\n" + "int islessequal(x, y);");
        islessequalDescription = ("The normal relation operations (like *<\\*, \"less than\") will fail if one of the operands is NaN. This will cause an exception. To avoid this, C99 defines the macros listed below." +
                "\n" + "These macros are guaranteed to evaluate their arguments only once. The arguments must be of real floating-point type (note: do not pass integer values as arguments to these macros, since the arguments will not be promoted to real-floating types)." +
                "\n" + "isgreater() determines (x) > (y) without an exception if x or y is NaN." +
                "\n" + "isgreaterequal() determines (x) >= (y) without an exception if x or y is NaN." +
                "\n" + "isless() determines (x) < (y) without an exception if x or y is NaN." +
                "\n" + "islessequal() determines (x) ⇐ (y) without an exception if x or y is NaN." +
                "\n" + "islessgreater() determines (x) < (y) || (x) > (y) without an exception if x or y is NaN. This macro is not equivalent to x != y because that expression is true if x or y is NaN." +
                "\n" + "isunordered() determines whether its arguments are unordered, that is, whether at least one of the arguments is a NaN.");
        islessgreaterName = ("isgreater, isgreaterequal, isless, islessequal, islessgreater, isunordered - floating-point relational tests without exception for NaN");
        islessgreaterSynopsis = ("#include <math.h>\n" + "\n" + "int islessgreater(x, y);");
        islessgreaterDescription = ("The normal relation operations (like *<\\*, \"less than\") will fail if one of the operands is NaN. This will cause an exception. To avoid this, C99 defines the macros listed below." +
                "\n" + "These macros are guaranteed to evaluate their arguments only once. The arguments must be of real floating-point type (note: do not pass integer values as arguments to these macros, since the arguments will not be promoted to real-floating types)." +
                "\n" + "isgreater() determines (x) > (y) without an exception if x or y is NaN." +
                "\n" + "isgreaterequal() determines (x) >= (y) without an exception if x or y is NaN." + "\n" + "isless() determines (x) < (y) without an exception if x or y is NaN." +
                "\n" + "islessequal() determines (x) ⇐ (y) without an exception if x or y is NaN." +
                "\n" + "islessgreater() determines (x) < (y) || (x) > (y) without an exception if x or y is NaN. This macro is not equivalent to x != y because that expression is true if x or y is NaN." +
                "\n" + "isunordered() determines whether its arguments are unordered, that is, whether at least one of the arguments is a NaN.");
        isnanName = ("fpclassify, isfinite, isnormal, isnan, isinf - floating-point classification macros");
        isnanSynopsis = ("#include <math.h>\n" + "\n" + "int isnan(x);");
        isnanDescription = ("Floating point numbers can have special values, such as infinite or NaN. With the macro *fpclassify(\\*x\\*)\\* you can find out what type x is. The macro takes any floating-point expression as argument. The result is one of the following values:" +
                "\n" + "\\*FP_NAN\\* x is \"Not a Number\"." + "\n" + "\\*FP_INFINITE\\* x is either positive infinity or negative infinity." +
                "\n" + "\\*FP_ZERO\\* x is zero." + "\n" + "\\*FP_SUBNORMAL\\* x is too small to be represented in normalized format." +
                "\n" + "\\*FP_NORMAL\\* if nothing of the above is correct then it must be a normal floating-point number." +
                "\n" + "The other macros provide a short answer to some standard questions." +
                "\n" + "\\*isfinite(\\*_x_\\*)\\* returns a nonzero value if (fpclassify(x) != FP_NAN && fpclassify(x) != FP_INFINITE)" +
                "\n" + "\\*isnormal(\\*_x_\\*)\\* returns a nonzero value if (fpclassify(x) == FP_NORMAL)" +
                "\n" + "\\*isnan(\\*_x_\\*)\\* returns a nonzero value if (fpclassify(x) == FP_NAN)" +
                "\n" + "\\*isinf(\\*_x_\\*)\\* returns 1 if x is positive infinity, and -1 if x is negative infinity.");
        isnormalName = ("fpclassify, isfinite, isnormal, isnan, isinf - floating-point classification macros");
        isnormalSynopsis = ("#include <math.h>\n" + "\n" + "int isnormal(x);");
        isnormalDescription = ("Floating point numbers can have special values, such as infinite or NaN. With the macro *fpclassify(\\*x\\*)\\* you can find out what type x is. The macro takes any floating-point expression as argument. The result is one of the following values:" +
                "\n" + "\\*FP_NAN\\* x is \"Not a Number\"." + "\n" + "\\*FP_INFINITE\\* x is either positive infinity or negative infinity." +
                "\n" + "\\*FP_ZERO\\* x is zero." + "\n" + "\\*FP_SUBNORMAL\\* x is too small to be represented in normalized format." +
                "\n" + "\\*FP_NORMAL\\* if nothing of the above is correct then it must be a normal floating-point number." + "\n" + "The other macros provide a short answer to some standard questions." +
                "\n" + "\\*isfinite(\\*_x_\\*)\\* returns a nonzero value if (fpclassify(x) != FP_NAN && fpclassify(x) != FP_INFINITE)" +
                "\n" + "\\*isnormal(\\*_x_\\*)\\* returns a nonzero value if (fpclassify(x) == FP_NORMAL)" +
                "\n" + "\\*isnan(\\*_x_\\*)\\* returns a nonzero value if (fpclassify(x) == FP_NAN)" +
                "\n" + "\\*isinf(\\*_x_\\*)\\* returns 1 if x is positive infinity, and -1 if x is negative infinity.");
        isunorderedName = ("isgreater, isgreaterequal, isless, islessequal, islessgreater, isunordered - floating-point relational tests without exception for NaN");
        isunorderedSynopsis = ("#include <math.h>\n" + "\n" + "int isunordered(x, y);");
        isunorderedDescription = ("The normal relation operations (like *<\\*, \"less than\") will fail if one of the operands is NaN. This will cause an exception. To avoid this, C99 defines the macros listed below." +
                "\n" + "These macros are guaranteed to evaluate their arguments only once. The arguments must be of real floating-point type (note: do not pass integer values as arguments to these macros, since the arguments will not be promoted to real-floating types)." +
                "\n" + "isgreater() determines (x) > (y) without an exception if x or y is NaN." + "\n" + "isgreaterequal() determines (x) >= (y) without an exception if x or y is NaN." +
                "\n" + "isless() determines (x) < (y) without an exception if x or y is NaN." + "\n" + "islessequal() determines (x) ⇐ (y) without an exception if x or y is NaN." +
                "\n" + "islessgreater() determines (x) < (y) || (x) > (y) without an exception if x or y is NaN. This macro is not equivalent to x != y because that expression is true if x or y is NaN." +
                "\n" + "isunordered() determines whether its arguments are unordered, that is, whether at least one of the arguments is a NaN.");
        ldexpName = ("ldexp, ldexpf, ldexpl - multiply floating-point number by integral power of 2");
        ldexpSynopsis = ("#include <math.h>\n" + "\n" + "double ldexp(double x, int exp);\n" + "\n" + "float ldexpf(float x, int exp);\n" + "\n" + "long double ldexpl(long double x, int exp);");
        ldexpDescription = ("The ldexp() function returns the result of multiplying the floating-point number x by 2 raised to the power exp.");
        llrintName = ("lrint, lrintf, lrintl, llrint, llrintf, llrintl - round to nearest integer");
        llrintSynopsis = ("#include <math.h>\n" + "\n" + "long int lrint(double x);\n" + "\n" + "long int lrintf(float x);\n" + "\n" + "long int lrintl(long double x);\n" + "\n" + "long long int llrint(double x);\n" + "\n" + "long long int llrintf(float x);\n" + "\n" + "long long int llrintl(long double x);");
        llrintDescription = ("These functions round their argument to the nearest integer value, using the current rounding direction (see fesetround(3))." +
                "\n" + "Note that unlike rint(3), etc., the return type of these functions differs from that of their arguments.");
        llroundName = ("lround, lroundf, lroundl, llround, llroundf, llroundl - round to nearest integer, away from zero");
        llroundSynopsis = ("#include <math.h>\n" + "\n" + "long int lround(double x);\n" + "\n" + "long int lroundf(float x);\n" + "\n" + "long int lroundl(long double x);\n" + "\n" + "long long int llround(double x);\n" + "\n" + "long long int llroundf(float x);\n" + "\n" + "long long int llroundl(long double x);");
        llroundDescription = ("These functions round their argument to the nearest integer value, rounding away from zero, regardless of the current rounding direction (see fenv(3))." +
                "\n" + "Note that unlike round(3), ceil(3), etc., the return type of these functions differs from that of their arguments.");
        logName = ("log - computes natural logarithm");
        logSynopsis = ("#include <math.h>\n" + "\n" + "double log(double x);\n" + "\n" + "float logf(float x);\n" + "\n" + "long double logl(long double x);");
        logDescription = ("Computes the natural logarithm of x. The natural logarithm is the base e algorithm.");
        log10Name = ("log10 - computes logarithm");
        log10Synopsis = ("#include <math.h>\n" + "\n" + "double log10(double x);\n" + "\n" + "float log10f(float x);\n" + "\n" + "long double log10l(long double x);");
        log10Description = ("Computes the base 10 logarithm of x.");
        log1pName = ("log1p, log1pf, log1pl - logarithm of 1 plus argument");
        log1pSynopsis = ("#include <math.h>\n" + "\n" + "double log1p(double x);\n" + "\n" + "float log1pf(float x);\n" + "\n" + "long double log1pl(long double x);");
        log1pDescription = ("log1p(x) returns a value equivalent to log (1 + x) It is computed in a way that is accurate even if the value of x is near zero.");
        log2Name = ("log2 - computes base 2 logarithm");
        log2Synopsis = ("#include <math.h>\n" + "\n" + "double log2(double x);\n" + "\n" + "float log2f(float x);\n" + "\n" + "long double log2l(long double x);");
        log2Description = ("Computes the base 2 logarithm of x.");
        logbName = ("logb, logbf, logbl - get exponent of a floating-point value");
        logbSynopsis = ("#include <math.h>\n" + "\n" + "double logb(double x);\n" + "\n" + "float logbf(float x);\n" + "\n" + "long double logbl(long double x);");
        logbDescription = ("These functions extract the exponent from the internal floating-point representation of x and return it as a floating-point value. The integer constant *FLT_RADIX\\*, defined in <float.h>, indicates the radix used for the system’s floating-point representation. If *FLT_RADIX\\* is 2, *logb(\\*x*)\\* is equal to *floor(log2(\\*x*))\\*, except that it is probably faster." +
                "\n" + "If x is subnormal, logb() returns the exponent x would have if it were normalized.");
        lrintName = ("lrint, lrintf, lrintl, llrint, llrintf, llrintl - round to nearest integer");
        lrintSynopsis = ("#include <math.h>\n" + "\n" + "long int lrint(double x);\n" + "\n" + "long int lrintf(float x);\n" + "\n" + "long int lrintl(long double x);\n" + "\n" + "long long int llrint(double x);\n" + "\n" + "long long int llrintf(float x);\n" + "\n" + "long long int llrintl(long double x);");
        lrintDescription = ("These functions round their argument to the nearest integer value, using the current rounding direction (see fesetround(3))." +
                "\n" + "Note that unlike rint(3), etc., the return type of these functions differs from that of their arguments.");
        lroundName = ("lround, lroundf, lroundl, llround, llroundf, llroundl - round to nearest integer, away from zero");
        lroundSynopsis = ("#include <math.h>\n" + "\n" + "long int lround(double x);\n" + "\n" + "long int lroundf(float x);\n" + "\n" + "long int lroundl(long double x);\n" + "\n" + "long long int llround(double x);\n" + "\n" + "long long int llroundf(float x);\n" + "\n" + "long long int llroundl(long double x);");
        lroundDescription = ("These functions round their argument to the nearest integer value, rounding away from zero, regardless of the current rounding direction (see fenv(3))." +
                "\n" + "Note that unlike round(3), ceil(3), etc., the return type of these functions differs from that of their arguments.");
        modfName = ("modf, modff, modfl - extract signed integral and fractional values from floating-point number");
        modfSynopsis = ("#include <math.h>\n" + "\n" + "double modf(double x, double * iptr);\n" + "\n" + "float modff(float x, float * iptr);\n" + "\n" + "long double modfl(long double x, long double * iptr);");
        modfDescription = ("The modf() function breaks the argument x into an integral part and a fractional part, each of which has the same sign as x. The integral part is stored in the location pointed to by iptr.");
        nearbyintName = ("nearbyint, nearbyintf, nearbyintl, rint, rintf, rintl - round to nearest integer");
        nearbyintSynopsis = ("#include <math.h>\n" + "\n" + "double nearbyint(double x);\n" + "\n" + "float nearbyintf(float x);\n" + "\n" + "long double nearbyintl(long double x);\n" + "\n" + "double rint(double x);\n" + "\n" + "float rintf(float x);\n" + "\n" + "long double rintl(long double x);");
        nearbyintDescription = ("The nearbyint() functions round their argument to an integer value in floating-point format, using the current rounding direction (see fesetround(3)) and without raising the inexact exception." +
                "\n" + "The rint() functions do the same, but will raise the inexact exception (*FE_INEXACT\\*, checkable via fetestexcept(3)) when the result differs in value from the argument.");
        powName = ("pow - computes exponential expression");
        powSynopsis = ("#include <math.h>\n" + "\n" + "double pow(double x, double y);\n" + "\n" + "float powf(float x, float y);\n" + "\n" + "long double powl(long double x, long double y);");
        powDescription = ("Computes x raised to the y-th power.");
        remainderName = ("remainder - computes remainder");
        remainderSynopsis = ("#include <math.h>\n" + "\n" + "double remainder(double x, double y);\n" + "\n" + "float remainderf(float x, float y);\n" + "\n" + "long double remainderl(long double x, long double y);");
        remainderDescription = ("Computes the remainder of x divided by y as floats.");
        remquoName = ("remquo, remquof, remquol - remainder and part of quotient");
        remquoSynopsis = ("#include <math.h>\n" + "\n" + "double remquo(double x, double y, int * quo);\n" + "\n" + "float remquof(float x, float y, int * quo);\n" + "\n" + "long double remquol(long double x, long double y, int * quo);");
        remquoDescription = ("These functions compute the remainder and part of the quotient upon division of x by y. A few bits of the quotient are stored via the quo pointer. The remainder is returned as the function result." +
                "\n" + "The value of the remainder is the same as that computed by the remainder(3) function." +
                "\n" + "The value stored via the quo pointer has the sign of x / y and agrees with the quotient in at least the low order 3 bits." +
                "\n" + "For example, remquo(29.0, 3.0) returns -1.0 and might store 2. Note that the actual quotient might not fit in an integer.");
        rintName = ("nearbyint, nearbyintf, nearbyintl, rint, rintf, rintl - round to nearest integer");
        rintSynopsis = ("#include <math.h>\n" + "\n" + "double nearbyint(double x);\n" + "\n" + "float nearbyintf(float x);\n" + "\n" + "long double nearbyintl(long double x);\n" + "\n" + "double rint(double x);\n" + "\n" + "float rintf(float x);\n" + "\n" + "long double rintl(long double x);\n");
        rintDescription = ("The nearbyint() functions round their argument to an integer value in floating-point format, using the current rounding direction (see fesetround(3)) and without raising the inexact exception." +
                "\n" + "The rint() functions do the same, but will raise the inexact exception (FE_INEXACT, checkable via fetestexcept(3)) when the result differs in value from the argument.");
        roundName = ("round - rounds value");
        roundSynopsis = ("#include <math.h>\n" + "\n" + "double round(double x);\n" + "\n" + "float roundf(float x);\n" + "\n" + "long double roundl(long double x);");
        roundDescription = ("Rounds the double x to the nearest integer value.");
        scalblnName = ("scalbn, scalbnf, scalbnl, scalbln, scalblnf, scalblnl - multiply floating-point number by integral power of radix");
        scalblnSynopsis = ("#include <math.h>\n" + "\n" + "double scalbln(double x, long int exp);\n" + "\n" + "float scalblnf(float x, long int exp);\n" + "\n" + "long double scalblnl(long double x, long int exp);");
        scalblnDescription = ("These functions multiply their first argument x by FLT_RADIX (probably 2) to the power of exp, that is: x FLT_RADIX  exp The definition of FLT_RADIX can be obtained by including <float.h>.");
        scalbnName = ("scalbn, scalbnf, scalbnl, scalbln, scalblnf, scalblnl - multiply floating-point number by integral power of radix");
        scalbnSynopsis = ("#include <math.h>\n" + "\n" + "double scalbn(double x, int exp);\n" + "\n" + "float scalbnf(float x, int exp);\n" + "\n" + "long double scalbnl(long double x, int exp);");
        scalbnDescription = ("These functions multiply their first argument x by FLT_RADIX (probably 2) to the power of exp, that is: x FLT_RADIX  exp The definition of FLT_RADIX can be obtained by including <float.h>.");
        signbitName = ("signbit - test sign of a real floating-point number");
        signbitSynopsis = ("#include <math.h>\n" + "int signbit(x);");
        signbitDescription = ("signbit() is a generic macro which can work on all real floating-point types. It returns a nonzero value if the value of x has its sign bit set." +
                "\n" + "This is not the same as x < 0.0, because IEEE 754 floating point allows zero to be signed. The comparison -0.0 < 0.0 is false, but signbit(-0.0) will return a nonzero value." +
                "\n" + "NaNs and infinities have a sign bit.");
        sinName = ("sin - computes sine");
        sinSynopsis = ("#include <math.h>\n" + "\n" + "double sin(double x);\n" + "\n" + "float sinf(float x);\n" + "\n" + "long double sinl(long double x);");
        sinDescription = ("Computes the sine of the angle x in radians.");
        sinhName = ("sinh, sinhf, sinhl - hyperbolic sine function");
        sinhSynopsis = ("#include <math.h>\n" + "\n" + "double sinh(double x);\n" + "\n" + "float sinhf(float x);\n" + "\n" + "long double sinhl(long double x);");
        sinhDescription = ("The sinh() function returns the hyperbolic sine of x, which is defined mathematically as: sinh(x) = (exp(x) - exp(-x)) / 2");
        sqrtName = ("sqrt - computes square root");
        sqrtSynopsis = ("#include <math.h>\n" + "\n" + "double sqrt(double x);\n" + "\n" + "float sqrtf(float x);\n" + "\n" + "long double sqrtl(long double x);");
        sqrtDescription = ("Computes the square root of x.");
        tanName = ("tan - computes tangent");
        tanSynopsis = ("#include <math.h>\n" + "\n" + "double tan(double x);\n" + "\n" + "float tanf(float x);\n" + "\n" + "long double tanl(long double x);");
        tanDescription = ("Computes the tangent of the angle x in radians.");
        tgammaName = ("tgamma, tgammaf, tgammal - true gamma function");
        tgammaSynopsis = ("#include <math.h>\n" + "\n" + "double tgamma(double x);\n" + "\n" + "float tgammaf(float x);\n" + "\n" + "long double tgammal(long double x);");
        tgammaDescription = ("The Gamma function is defined by" + "\n" + "Gamma(x) = integral from 0 to infinity of t(x-1) e-t dt" +
                "\n" + "It is defined for every real number except for nonpositive integers. For nonnegative integral m one has" +
                "\n" + "Gamma(m+1) = m!" + "and, more generally, for all x:" + "\n" + "Gamma(x+1) = x \\* Gamma(x)" +
                "Furthermore, the following is valid for all values of x outside the poles:" +
                "\n" + "Gamma(x) \\* Gamma(1 - x) = PI / sin(PI \\* x)");
        truncName = ("trunc, truncf, truncl - round to integer, toward zero");
        truncSynopsis = ("#include <math.h>\n" + "\n" + "double trunc(double x);\n" + "\n" + "float truncf(float x);\n" + "\n" + "long double truncl(long double x);");
        truncDescription = ("These functions round x to the nearest integer not larger in absolute value.");
        longjmpName = ("longjmp, siglongjmp - nonlocal jump to a saved stack context");
        longjmpSynopsis = ("#include <setjmp.h>\n" + "\n" + "void longjmp(jmp_buf env, int val);" + "\n" + "void siglongjmp(sigjmp_buf env, int val);");
        longjmpDescription = ("longjmp() and setjmp(3) are useful for dealing with errors and interrupts encountered in a low-level subroutine of a program. longjmp() restores the environment saved by the last call of setjmp(3) with the corresponding env argument. After longjmp() is completed, program execution continues as if the corresponding call of setjmp(3) had just returned the value val. longjmp() cannot cause 0 to be returned. If longjmp() is invoked with a second argument of 0, 1 will be returned instead.\n" +
                "\n" + "siglongjmp() is similar to longjmp() except for the type of its env argument. If, and only if, the sigsetjmp(3) call that set this env used a nonzero savesigs flag, siglongjmp() also restores the signal mask that was saved by sigsetjmp(3).");
        setjmpName = ("setjmp, sigsetjmp - save stack context for nonlocal goto");
        setjmpSynopsis = ("#include <setjmp.h>\n" + "int setjmp(jmp_buf env);");
        setjmpDescription = ("setjmp() and longjmp(3) are useful for dealing with errors and interrupts encountered in a low-level subroutine of a program. setjmp() saves the stack context/environment in env for later use by longjmp(3). The stack context will be invalidated if the function which called setjmp() returns.\n" +
                "\n" + "sigsetjmp() is similar to setjmp(). If, and only if, savesigs is nonzero, the process’s current signal mask is saved in env and will be restored if a siglongjmp(3) is later performed with this env.\n" + "\n");
        raiseName = ("raise - send a signal to the caller");
        raiseSynopsis = ("#include <signal.h>\n" + "int raise(int sig);");
        raiseDescription = ("The raise() function sends a signal to the calling process or thread. In a single-threaded program it is equivalent to kill(getpid(), sig); In a multithreaded program it is equivalent to pthread_kill(pthread_self(), sig); If the signal causes a handler to be called, raise() will return only after the signal handler has returned.\n" + "\n");
        signalName = ("signal - signal management");
        signalSynopsis = ("#include <signal.h>\n" + "void (*signal(int _sig_*, void (**_func_*)(int)))(int);");
        signalDescription = ("Use of this function is unspecified in a multi-threaded process." +
                "\n" + "The signal() function chooses one of three ways in which receipt of the signal number sig is to be subsequently handled. If the value of func is SIG_DFL, default handling for that signal shall occur. If the value of func is SIG_IGN, the signal shall be ignored. Otherwise, the application shall ensure that func points to a function to be called when that signal occurs. An invocation of such a function because of a signal, or (recursively) of any further functions called by that invocation (other than functions in the standard library), is called a \"signal handler\".\n" +
                "\n" + "When a signal occurs, and func points to a function, it is implementation-defined whether the equivalent of a: *signal(\\*sig\\*, SIG_DFL); \\* is executed or the implementation prevents some implementation-defined set of signals (at least including sig) from occurring until the current signal handling has completed. (If the value of sig is SIGILL, the implementation may alternatively define that no action is taken.) Next the equivalent of: *(\\*func)(sig); \\* is executed. If and when the function returns, if the value of sig was SIGFPE, SIGILL, or SIGSEGV or any other implementation-defined value corresponding to a computational exception, the behavior is undefined. Otherwise, the program shall resume execution at the point it was interrupted. If the signal occurs as the result of calling the abort(), raise(), kill(), pthread_kill(), or sigqueue() function, the signal handler shall not call the raise() function.\n" +
                "\n" + "If the signal occurs other than as the result of calling abort(), raise(), kill(), pthread_kill(), or sigqueue(),  the behavior is undefined if the signal handler refers to any object with static storage duration other than by assigning a value to an object declared as volatile sig_atomic_t, or if the signal handler calls any function in the standard library other than one of the functions listed in Signal Concepts . Furthermore, if such a call fails, the value of errno is unspecified.\n" +
                "\n" + "At program start-up, the equivalent of: *signal(\\*sig\\*, SIG_IGN); \\* is executed for some signals, and the equivalent of: *signal(\\*sig\\*, SIG_DFL); \\* is executed for all other signals (see exec).");
        stdargName = ("stdarg, va_start, va_arg, va_end, va_copy - variable argument lists");
        stdargSynopsis = ("#include <stdarg.h>\n" + "\n" + "void va_start(va_list ap, last);\n" + "\n" + "type va_arg(va_list ap, type);\n" + "\n" + "void va_end(va_list ap);\n" + "\n" + "void va_copy(va_list dest, va_list src);");
        stdargDescription = ("A function may be called with a varying number of arguments of varying types. The include file <stdarg.h> declares a type va_list and defines three macros for stepping through a list of arguments whose number and types are not known to the called function.\n" +
                "\n" + "The called function must declare an object of type va_list which is used by the macros va_start(), va_arg(), and va_end().\n" +
                "\n" + "The va_start() macro initializes ap for subsequent use by va_arg() and va_end(), and must be called first.\n" +
                "\n" + "The argument last is the name of the last argument before the variable argument list, that is, the last argument of which the calling function knows the type.\n" +
                "\n" + "Because the address of this argument may be used in the va_start() macro, it should not be declared as a register variable, or as a function or an array type.\n" +
                "\n" + "The va_arg() macro expands to an expression that has the type and value of the next argument in the call. The argument ap is the va_list ap initialized by va_start(). Each call to va_arg() modifies ap so that the next call returns the next argument. The argument type is a type name specified so that the type of a pointer to an object that has the specified type can be obtained simply by adding a \\* to type.\n" +
                "\n" + "The first use of the va_arg() macro after that of the va_start() macro returns the argument after last. Successive invocations return the values of the remaining arguments.\n" +
                "\n" + "If there is no next argument, or if type is not compatible with the type of the actual next argument (as promoted according to the default argument promotions), random errors will occur.");
        va_argName = ("stdarg, va_start, va_arg, va_end, va_copy - variable argument lists");
        va_argSynopsis = ("#include <stdarg.h>\n" + "\n" + "void va_start(va_list ap, last);\n" + "\n" + "type va_arg(va_list ap, type);\n" + "\n" + "void va_end(va_list ap);\n" + "\n" + "void va_copy(va_list dest, va_list src);");
        va_argDescription = ("A function may be called with a varying number of arguments of varying types. The include file <stdarg.h> declares a type va_list and defines three macros for stepping through a list of arguments whose number and types are not known to the called function.\n" +
                "\n" + "The called function must declare an object of type va_list which is used by the macros va_start(), va_arg(), and va_end().\n" +
                "\n" + "The va_start() macro initializes ap for subsequent use by va_arg() and va_end(), and must be called first.\n" +
                "\n" + "The argument last is the name of the last argument before the variable argument list, that is, the last argument of which the calling function knows the type.\n" +
                "\n" + "Because the address of this argument may be used in the va_start() macro, it should not be declared as a register variable, or as a function or an array type.\n" +
                "\n" + "The va_arg() macro expands to an expression that has the type and value of the next argument in the call. The argument ap is the va_list ap initialized by va_start(). Each call to va_arg() modifies ap so that the next call returns the next argument. The argument type is a type name specified so that the type of a pointer to an object that has the specified type can be obtained simply by adding a \\* to type.\n" +
                "\n" + "The first use of the va_arg() macro after that of the va_start() macro returns the argument after last. Successive invocations return the values of the remaining arguments.\n" +
                "\n" + "If there is no next argument, or if type is not compatible with the type of the actual next argument (as promoted according to the default argument promotions), random errors will occur.\n" +
                "\n" + "If ap is passed to a function that uses *va_arg(\\*ap*,\\*type*)\\* then the value of ap is undefined after the return of that function.\n" +
                "\n" + "Each invocation of va_start() must be matched by a corresponding invocation of va_end() in the same function. After the call *va_end(\\*ap*)\\* the variable ap is undefined. Multiple traversals of the list, each bracketed by va_start() and va_end() are possible. va_end() may be a macro or a function.\n" +
                "\n" + "The va_copy() macro copies the (previously initialized) variable argument list src to dest. The behavior is as if va_start() were applied to dest with the same last argument, followed by the same number of va_arg() invocations that was used to reach the current state of src.");
        va_copyName = ("stdarg, va_start, va_arg, va_end, va_copy - variable argument lists");
        va_copySynopsis = ("#include <stdarg.h>\n" + "void va_copy(va_list dest, va_list src);");
        va_copyDescription = ("A function may be called with a varying number of arguments of varying types. The include file <stdarg.h> declares a type va_list and defines three macros for stepping through a list of arguments whose number and types are not known to the called function.\n" +
                "\n" + "The called function must declare an object of type va_list which is used by the macros va_start(), va_arg(), and va_end().\n" +
                "\n" + "The va_start() macro initializes ap for subsequent use by va_arg() and va_end(), and must be called first.\n" +
                "\n" + "The argument last is the name of the last argument before the variable argument list, that is, the last argument of which the calling function knows the type.\n" +
                "\n" + "Because the address of this argument may be used in the va_start() macro, it should not be declared as a register variable, or as a function or an array type.\n" +
                "\n" + "The va_arg() macro expands to an expression that has the type and value of the next argument in the call. The argument ap is the va_list ap initialized by va_start(). Each call to va_arg() modifies ap so that the next call returns the next argument. The argument type is a type name specified so that the type of a pointer to an object that has the specified type can be obtained simply by adding a \\* to type.\n" +
                "\n" + "The first use of the va_arg() macro after that of the va_start() macro returns the argument after last. Successive invocations return the values of the remaining arguments.\n" +
                "\n" + "If there is no next argument, or if type is not compatible with the type of the actual next argument (as promoted according to the default argument promotions), random errors will occur.\n" +
                "\n" + "If ap is passed to a function that uses *va_arg(\\*ap*,\\*type*)\\* then the value of ap is undefined after the return of that function.\n" +
                "\n" + "Each invocation of va_start() must be matched by a corresponding invocation of va_end() in the same function. After the call *va_end(\\*ap*)\\* the variable ap is undefined. Multiple traversals of the list, each bracketed by va_start() and va_end() are possible. va_end() may be a macro or a function.\n" +
                "\n" + "The va_copy() macro copies the (previously initialized) variable argument list src to dest. The behavior is as if va_start() were applied to dest with the same last argument, followed by the same number of va_arg() invocations that was used to reach the current state of src.");
        va_endName = ("stdarg, va_start, va_arg, va_end, va_copy - variable argument lists");
        va_endSynopsis = ("#include <stdarg.h>\n" + "void va_end(va_list ap);");
        va_endDescription = ("A function may be called with a varying number of arguments of varying types. The include file <stdarg.h> declares a type va_list and defines three macros for stepping through a list of arguments whose number and types are not known to the called function.\n" +
                "\n" + "The called function must declare an object of type va_list which is used by the macros va_start(), va_arg(), and va_end().\n" +
                "\n" + "The va_start() macro initializes ap for subsequent use by va_arg() and va_end(), and must be called first.\n" +
                "\n" + "The argument last is the name of the last argument before the variable argument list, that is, the last argument of which the calling function knows the type.\n" +
                "\n" + "Because the address of this argument may be used in the va_start() macro, it should not be declared as a register variable, or as a function or an array type.\n" +
                "\n" + "The va_arg() macro expands to an expression that has the type and value of the next argument in the call. The argument ap is the va_list ap initialized by va_start(). Each call to va_arg() modifies ap so that the next call returns the next argument. The argument type is a type name specified so that the type of a pointer to an object that has the specified type can be obtained simply by adding a \\* to type.\n" +
                "\n" + "The first use of the va_arg() macro after that of the va_start() macro returns the argument after last. Successive invocations return the values of the remaining arguments.\n" +
                "\n" + "If there is no next argument, or if type is not compatible with the type of the actual next argument (as promoted according to the default argument promotions), random errors will occur.\n" +
                "\n" + "If ap is passed to a function that uses *va_arg(\\*ap*,\\*type*)\\* then the value of ap is undefined after the return of that function.\n" +
                "\n" + "Each invocation of va_start() must be matched by a corresponding invocation of va_end() in the same function. After the call *va_end(\\*ap*)\\* the variable ap is undefined. Multiple traversals of the list, each bracketed by va_start() and va_end() are possible. va_end() may be a macro or a function.\n" +
                "\n" + "The va_copy() macro copies the (previously initialized) variable argument list src to dest. The behavior is as if va_start() were applied to dest with the same last argument, followed by the same number of va_arg() invocations that was used to reach the current state of src.");
        va_startName = ("stdarg, va_start, va_arg, va_end, va_copy - variable argument lists");
        va_startSynopsis = ("#include <stdarg.h>\n" + "void va_start(va_list ap, last);");
        va_startDescription = ("A function may be called with a varying number of arguments of varying types. The include file <stdarg.h> declares a type va_list and defines three macros for stepping through a list of arguments whose number and types are not known to the called function.\n" +
                "\n" + "The called function must declare an object of type va_list which is used by the macros va_start(), va_arg(), and va_end().\n" +
                "\n" + "The va_start() macro initializes ap for subsequent use by va_arg() and va_end(), and must be called first.\n" +
                "\n" + "The argument last is the name of the last argument before the variable argument list, that is, the last argument of which the calling function knows the type.\n" +
                "\n" + "Because the address of this argument may be used in the va_start() macro, it should not be declared as a register variable, or as a function or an array type.\n" +
                "\n" + "The va_arg() macro expands to an expression that has the type and value of the next argument in the call. The argument ap is the va_list ap initialized by va_start(). Each call to va_arg() modifies ap so that the next call returns the next argument. The argument type is a type name specified so that the type of a pointer to an object that has the specified type can be obtained simply by adding a \\* to type.\n" +
                "\n" + "The first use of the va_arg() macro after that of the va_start() macro returns the argument after last. Successive invocations return the values of the remaining arguments.\n" +
                "\n" + "If there is no next argument, or if type is not compatible with the type of the actual next argument (as promoted according to the default argument promotions), random errors will occur.\n" +
                "\n" + "If ap is passed to a function that uses *va_arg(\\*ap*,\\*type*)\\* then the value of ap is undefined after the return of that function.\n" +
                "\n" + "Each invocation of va_start() must be matched by a corresponding invocation of va_end() in the same function. After the call *va_end(\\*ap*)\\* the variable ap is undefined. Multiple traversals of the list, each bracketed by va_start() and va_end() are possible. va_end() may be a macro or a function.\n" +
                "\n" + "The va_copy() macro copies the (previously initialized) variable argument list src to dest. The behavior is as if va_start() were applied to dest with the same last argument, followed by the same number of va_arg() invocations that was used to reach the current state of src.");
        clearerrName = ("clearerr, feof, ferror, fileno - check and reset stream status");
        clearerrSynopsis = ("#include <stdio.h>\n" + "\n" + "void clearerr(FILE * stream);\n" + "\n" + "int feof(FILE * stream);\n" + "\n" + "int ferror(FILE * stream);\n" + "\n" + "int fileno(FILE * stream);");
        clearerrDescription = ("The function clearerr() clears the end-of-file and error indicators for the stream pointed to by stream.\n" +
                "\n" + "The function feof() tests the end-of-file indicator for the stream pointed to by stream, returning nonzero if it is set. The end-of-file indicator can be cleared only by the function clearerr().\n" +
                "\n" + "The function ferror() tests the error indicator for the stream pointed to by stream, returning nonzero if it is set. The error indicator can be reset only by the clearerr() function.\n" +
                "\n" + "The function fileno() examines the argument stream and returns its integer descriptor.\n" +
                "\n" + "For nonlocking counterparts, see unlocked_stdio(3).");
        fcloseName = ("fclose - close an open file");
        fcloseSynopsis = ("#include <stdio.h>\n" + "int fclose(FILE * fp);");
        fcloseDescription = ("Closes the current file pointed to by file pointer fp.");
        feofName = ("feof - checks whether pointer to file has reached the end of the file");
        feofSynopsis = ("#include <stdio.h>\n" + "int feof(FILE * stream);");
        feofDescription = ("Checks whether pointer to file has reached the end of the file.");
        ferrorName = ("clearerr, feof, ferror, fileno - check and reset stream status");
        ferrorSynopsis = ("#include <stdio.h>\n" + "int ferror(FILE * stream);");
        ferrorDescription = ("The function clearerr() clears the end-of-file and error indicators for the stream pointed to by stream.\n" +
                "\n" + "The function feof() tests the end-of-file indicator for the stream pointed to by stream, returning nonzero if it is set. The end-of-file indicator can be cleared only by the function clearerr().\n" +
                "\n" + "The function ferror() tests the error indicator for the stream pointed to by stream, returning nonzero if it is set. The error indicator can be reset only by the clearerr() function.\n" +
                "\n" + "The function fileno() examines the argument stream and returns its integer descriptor.\n" +
                "\n" + "For nonlocking counterparts, see unlocked_stdio(3).");
        fflushName = ("fflush - flush a stream");
        fflushSynopsis = ("#include <stdio.h>\n" + "int fflush(FILE * stream);");
        fflushDescription = ("For output streams, fflush() forces a write of all user-space buffered data for the given output or update stream via the stream’s underlying write function. For input streams, fflush() discards any buffered data that has been fetched from the underlying file, but has not been consumed by the application. The open status of the stream is unaffected.\n" +
                "\n" + "If the stream argument is NULL, fflush() flushes all open output streams.\n" +
                "\n" + "For a nonlocking counterpart, see unlocked_stdio(3).");
        fgetcName = ("fgetc - get the next character from a file");
        fgetcSynopsis = ("#include <stdio.h>\n" + "\n" + "int fgetc(FILE * stream);" + "\n" + "char * fgets(char * s, int size, FILE * stream);");
        fgetcDescription = ("Gets the next character from a file.");
        fgetposName = ("fgetpos, fseek, fsetpos, ftell, rewind - reposition a stream");
        fgetposSynopsis = ("#include <stdio.h>\n" + "\n" + "int fseek(FILE * stream, long offset, int whence);\n" + "\n" + "long ftell(FILE * stream);\n" + "\n" + "void rewind(FILE * stream);\n" + "\n" + "int fgetpos(FILE * stream, fpos_t * pos);\n" + "\n" + "int fsetpos(FILE * stream, fpos_t * pos);");
        fgetposDescription = ("The fseek() function sets the file position indicator for the stream pointed to by stream. The new position, measured in bytes, is obtained by adding offset bytes to the position specified by whence. If whence is set to *SEEK_SET\\*, *SEEK_CUR\\*, or *SEEK_END\\*, the offset is relative to the start of the file, the current position indicator, or end-of-file, respectively. A successful call to the fseek() function clears the end-of-file indicator for the stream and undoes any effects of the ungetc(3) function on the same stream.\n" +
                "\n" + "The ftell() function obtains the current value of the file position indicator for the stream pointed to by stream.\n" +
                "\n" + "The rewind() function sets the file position indicator for the stream pointed to by stream to the beginning of the file. It is equivalent to: ( void ) fseek stream 0L SEEK_SET except that the error indicator for the stream is also cleared (see clearerr(3)).\n" +
                "\n" + "The fgetpos() and fsetpos() functions are alternate interfaces equivalent to ftell() and fseek() (with whence set to *SEEK_SET\\*), setting and storing the current value of the file offset into or from the object referenced by pos. On some non-UNIX systems, an fpos_t object may be a complex object and these routines may be the only way to portably reposition a text stream.");
        fgetsName = ("fgets - get the next string from a file");
        fgetsSynopsis = ("#include <stdio.h>\n" + "char * fgets(char * s, int size, FILE * stream);");
        fgetsDescription = ("fgets reads in, at most, i characters from file fp, storing them temporarily in buffer s.");
        fopenName = ("fopen - opens a file");
        fopenSynopsis = ("#include <stdio.h>\n" + "\n" + "*fopen FILE(const char * path, const char * mode);\n" + "\n" + "*fdopen FILE(int fd, const char * mode);\n" + "\n" + "*freopen FILE(const char * path, const char * mode, FILE * stream);");
        fopenDescription = ("fopen opens file filename in the specified mode. The mode can be a number of things, however, the most common are r for reading, w for writing, and a for appending. It should be noted, if you are opening a file to read using r then that file MUST exist, otherwise fopen will return NULL, something you should check for. Writing with w will create an empty file even if one of the same name already exists, so be careful! Appending with a will append data to the end of an already present file, or create an empty file if filename doesn’t exist.");
        fprintfName = ("fprintf - print out a formatted string");
        fprintfSynopsis = ("#include <stdio.h>\n" + "int fprintf(FILE * stream, const char * format, ...);");
        fprintfDescription = ("Used to print to a file in a specific, formatted fashion, fprintf prints to the file fp as the string format indicates.");
        fputcName = ("fputc - write a character to a file");
        fputcSynopsis = ("#include <stdio.h>\n" + "int fputc(int c, FILE * stream);");
        fputcDescription = ("Used to write a single character to a file.");
        fputsName = ("fputs - write a string to a file");
        fputsSynopsis = ("#include <stdio.h>\n" + "int fputs(const char * s, FILE * stream);");
        fputsDescription = ("puts is used to write a null terminated string s to file fp.");
        freadName = ("fread - read from a file");
        freadSynopsis = ("#include <stdio.h>\n" + "size_t fread(void * ptr, size_t size, size_t nmemb, FILE * stream);");
        freadDescription = ("fread reads in from file fp an element of size bytes blocks number of times. So, for example, if size is 50 and blocks 10, then fread will read in from fp 10 times, each time reading in 50 bytes (for a total of 500 bytes). On each fread, it will store the bytes in a buffer pointer to by ptr.");
        freopenName = ("fopen, fdopen, freopen - stream open functions");
        freopenSynopsis = ("#include <stdio.h>\n" + "\n" + "*fopen FILE(const char * path, const char * mode);\n" + "\n" + "*fdopen FILE(int fd, const char * mode);\n" + "\n" + "*freopen FILE(const char * path, const char * mode, FILE * stream);");
        freopenDescription = ("The *fopen\\*() function opens the file whose name is the string pointed to by path and associates a stream with it.\n" +
                "\n" + "The argument mode points to a string beginning with one of the following sequences (possibly followed by additional characters, as described below):\n" +
                "\n" + "\\*r\\* Open text file for reading. The stream is positioned at the beginning of the file.\n" +
                "\n" + "\\*r+\\* Open for reading and writing. The stream is positioned at the beginning of the file.\n" +
                "\n" + "\\*w\\* Truncate file to zero length or create text file for writing. The stream is positioned at the beginning of the file.\n" +
                "\n" + "\\*w+\\* Open for reading and writing. The file is created if it does not exist, otherwise it is truncated. The stream is positioned at the beginning of the file.\n" +
                "\n" + "\\*a\\* Open for appending (writing at end of file). The file is created if it does not exist. The stream is positioned at the end of the file.\n" +
                "\n" + "\\*a+\\* Open for reading and appending (writing at end of file). The file is created if it does not exist. The initial file position for reading is at the beginning of the file, but output is always appended to the end of the file.\n" +
                "\n" + "The mode string can also include the letter b either as a last character or as a character between the characters in any of the two-character strings described above. This is strictly for compatibility with C89 and has no effect; the b is ignored on all POSIX conforming systems, including Linux. (Other systems may treat text files and binary files differently, and adding the b may be a good idea if you do I/O to a binary file and expect that your program may be ported to non-UNIX environments.)");
        fscanfName = ("fscanf - read in a formatted string");
        fscanfSynopsis = ("#include <stdio.h>\n" + "int fscanf(FILE * stream, const char * format, ...);");
        fscanfDescription = ("fscanf reads in from file fp input that matches format.");
        fseekName = ("fseek - sets file position");
        fseekSynopsis = ("#include <stdio.h>\n" + "int fseek(FILE * stream, long offset, int whence);");
        fseekDescription = ("Use fseek when you want to change the offset of the file pointer fp. This is an extremely useful tool. Normally, when reading in from a file, the pointer continues in one direction, from the start of the file to the end. fseek, however, allows you to change the location of the file pointer.\n" +
                "\n" + "offset refers to how many bytes you want to change the current position of the file pointer fp. You can go both forward with positive numbers, or backward with negative numbers.\n" +
                "\n" + "If you want to change the location of the pointer fp from its current location, set from_where to SEEK_CUR. To instead set the file pointer fp to a location in relation to the end of the file, set from_where to SEEK_END. Similarly, if you want to alter the pointer in relation to the beginning of the file, set from_where to SEEK_SET.");
        fsetposName = ("fgetpos, fseek, fsetpos, ftell, rewind - reposition a stream");
        fsetposSynopsis = ("#include <stdio.h>\n" + "\n" + "int fgetpos(FILE * stream, fpos_t * pos);\n" + "int fsetpos(FILE * stream, fpos_t * pos);");
        fsetposDescription = ("The fgetpos() and fsetpos() functions are alternate interfaces equivalent to ftell() and fseek() (with whence set to *SEEK_SET\\*), setting and storing the current value of the file offset into or from the object referenced by pos. On some non-UNIX systems, an fpos_t object may be a complex object and these routines may be the only way to portably reposition a text stream.");
        ftellName = ("fgetpos, fseek, fsetpos, ftell, rewind - reposition a stream");
        ftellSynopsis = ("#include <stdio.h>\n" + "long ftell(FILE * stream);");
        ftellDescription = ("The ftell() function obtains the current value of the file position indicator for the stream pointed to by stream.");
        fwriteName = ("fwrite - write to a file");
        fwriteSynopsis = ("#include <stdio.h>\n" + "\n" + "size_t fread(void * ptr, size_t size, size_t nmemb, FILE * stream);\n" + "\n" + "size_t fwrite(const void * ptr, size_t size, size_t nmemb, FILE * stream);");
        fwriteDescription = ("Similar to fread, fwrite writes out to file fp an element of size bytes blocks number of times. So, for example, if size is 50 and blocks 10, then fwrite will write to fp 10 times, each time a \"chunk\" of 50 bytes (for a total of 500 bytes). On each fwrite, it will write from the buffer pointer to by ptr.");
        getcName = ("fgetc, fgets, getc, getchar, gets, ungetc - input of characters and strings");
        getcSynopsis = ("#include <stdio.h>\n" + "int getc(FILE * stream);");
        getcDescription = ("fgetc() reads the next character from stream and returns it as an unsigned char cast to an int, or *EOF\\* on end of file or error.\n" +
                "\n" + "getc() is equivalent to fgetc() except that it may be implemented as a macro which evaluates stream more than once.");
        getcharName = ("fgetc, fgets, getc, getchar, gets, ungetc - input of characters and strings");
        getcharSynopsis = ("#include <stdio.h>\n" + "\n" + "int getchar(void);\n" + "\n" + "char * gets(char * s);");
        getcharDescription = ("fgetc() reads the next character from stream and returns it as an unsigned char cast to an int, or *EOF\\* on end of file or error.\n" +
                "\n" + "getc() is equivalent to fgetc() except that it may be implemented as a macro which evaluates stream more than once.\n" +
                "\n" + "getchar() is equivalent to *getc(\\*stdin\\*)\\*.");
        getsName = ("fgetc, fgets, getc, getchar, gets, ungetc - input of characters and strings");
        getsSynopsis = ("#include <stdio.h>\n" + "\n" + "int getchar(void);\n" + "\n" + "char * gets(char * s);");
        getsDescription = ("gets() reads a line from stdin into the buffer pointed to by s until either a terminating newline or *EOF\\*, which it replaces with a null byte (\\0). No check for buffer overrun is performed ");
        perrorName = ("perror - print a system error message");
        perrorSynopsis = ("#include <stdio.h>\n" + "void perror(const char * s);");
        perrorDescription = ("The routine perror() produces a message on the standard error output, describing the last error encountered during a call to a system or library function. First (if s is not NULL and \\*s is not a null byte (\\0)) the argument string s is printed, followed by a colon and a blank. Then the message and a new-line.\n" +
                "\n" + "To be of most use, the argument string should include the name of the function that incurred the error. The error number is taken from the external variable errno, which is set when errors occur but not cleared when successful calls are made.\n" +
                "\n" + "The global error list sys_errlist[] indexed by errno can be used to obtain the error message without the newline. The largest message number provided in the table is sys_nerr-1. Be careful when directly accessing this list because new error values may not have been added to sys_errlist[]. The use of sys_errlist[] is nowadays deprecated.\n" +
                "\n" + "When a system call fails, it usually returns -1 and sets the variable errno to a value describing what went wrong. (These values can be found in <errno.h>.) Many library functions do likewise. The function perror() serves to translate this error code into human-readable form. Note that errno is undefined after a successful library call: this call may well change this variable, even though it succeeds, for example because it internally used some other library function that failed. Thus, if a failing call is not immediately followed by a call to perror(), the value of errno should be saved.");
        printfName = ("printf - prints to stdout");
        printfSynopsis = ("#include <stdio.h>\n" + "int printf(const char * format, ...);\n");
        printfDescription = ("In C programming language, printf() function is used to print the “character, string, float, integer, octal and hexadecimal values” onto the output screen.\n" +
                "We use printf() function with %d format specifier to display the value of an integer variable.\n" +
                "Similarly %c is used to display character, %f for float variable, %s for string variable, %lf for double and %x for hexadecimal variable.\n" +
                "To generate a newline,we use “\\n” in C printf() statement.");
        putcName = ("fputc, fputs, putc, putchar, puts - output of characters and strings");
        putcSynopsis = ("#include <stdio.h>\n" + "int fputc(int c, FILE * stream);\n" + "\n" + "\n" + "int fputs(const char * s, FILE * stream);\n" + "\n" + "int putc(int c, FILE * stream);\n" + "\n" + "int putchar(int c);\n" + "\n" + "int puts(const char * s);");
        putcDescription = ("fputc() writes the character c, cast to an unsigned char, to stream.\n" +
                "\n" + "fputs() writes the string s to stream, without its terminating null byte (\\0).\n" +
                "\n" + "putc() is equivalent to fputc() except that it may be implemented as a macro which evaluates stream more than once.\n" +
                "\n" + "*putchar(\\*c*);\\* is equivalent to *putc(\\*c*,\\*stdout\\*).\\*\n" +
                "\n" + "puts() writes the string s and a trailing newline to stdout.\n" +
                "\n" + "Calls to the functions described here can be mixed with each other and with calls to other output functions from the stdio library for the same output stream.");
        putcharName = ("fputc, fputs, putc, putchar, puts - output of characters and strings");
        putcharSynopsis = ("#include <stdio.h>\n" + "int fputc(int c, FILE * stream);\n" + "\n" + "\n" + "int fputs(const char * s, FILE * stream);\n" + "\n" + "int putc(int c, FILE * stream);\n" + "\n" + "int putchar(int c);\n" + "\n" + "int puts(const char * s);");
        putcharDescription = ("fputc() writes the character c, cast to an unsigned char, to stream.\n" +
                "\n" + "fputs() writes the string s to stream, without its terminating null byte (\\0).\n" +
                "\n" + "putc() is equivalent to fputc() except that it may be implemented as a macro which evaluates stream more than once.\n" +
                "\n" + "*putchar(\\*c*);\\* is equivalent to *putc(\\*c*,\\*stdout\\*).\\*\n" +
                "\n" + "puts() writes the string s and a trailing newline to stdout.\n" +
                "\n" + "Calls to the functions described here can be mixed with each other and with calls to other output functions from the stdio library for the same output stream.");
        putsName = ("fputc, fputs, putc, putchar, puts - output of characters and strings");
        putsSynopsis = ("#include <stdio.h>\n" + "int fputc(int c, FILE * stream);\n" + "\n" + "\n" + "int fputs(const char * s, FILE * stream);\n" + "\n" + "int putc(int c, FILE * stream);\n" + "\n" + "int putchar(int c);\n" + "\n" + "int puts(const char * s);");
        putsDescription = ("fputc() writes the character c, cast to an unsigned char, to stream.\n" +
                "\n" + "fputs() writes the string s to stream, without its terminating null byte (\\0).\n" +
                "\n" + "putc() is equivalent to fputc() except that it may be implemented as a macro which evaluates stream more than once.\n" +
                "\n" + "*putchar(\\*c*);\\* is equivalent to *putc(\\*c*,\\*stdout\\*).\\*\n" +
                "\n" + "puts() writes the string s and a trailing newline to stdout.\n" +
                "\n" + "Calls to the functions described here can be mixed with each other and with calls to other output functions from the stdio library for the same output stream.");
        removeName = ("remove - remove a file or directory");
        removeSynopsis = ("#include <stdio.h>\n" + "int remove(const char * pathname);");
        removeDescription = ("remove() deletes a name from the file system. It calls unlink(2) for files, and rmdir(2) for directories.\n" +
                "\n" + "If the removed name was the last link to a file and no processes have the file open, the file is deleted and the space it was using is made available for reuse.\n" +
                "\n" + "If the name was the last link to a file, but any processes still have the file open, the file will remain in existence until the last file descriptor referring to it is closed.\n" +
                "\n" + "If the name referred to a symbolic link, the link is removed.\n" +
                "\n" + "If the name referred to a socket, FIFO, or device, the name is removed, but processes which have the object open may continue to use it.");
        rewindName = ("fgetpos, fseek, fsetpos, ftell, rewind - reposition a stream");
        rewindSynopsis = ("#include <stdio.h>\n" + "\n" + "int fseek(FILE * stream, long offset, int whence);\n" + "\n" + "long ftell(FILE * stream);\n" + "\n" + "void rewind(FILE * stream);");
        rewindDescription = ("The fseek() function sets the file position indicator for the stream pointed to by stream. The new position, measured in bytes, is obtained by adding offset bytes to the position specified by whence. If whence is set to *SEEK_SET\\*, *SEEK_CUR\\*, or *SEEK_END\\*, the offset is relative to the start of the file, the current position indicator, or end-of-file, respectively. A successful call to the fseek() function clears the end-of-file indicator for the stream and undoes any effects of the ungetc(3) function on the same stream.\n" +
                "\n" + "The ftell() function obtains the current value of the file position indicator for the stream pointed to by stream.\n" +
                "\n" + "The rewind() function sets the file position indicator for the stream pointed to by stream to the beginning of the file. It is equivalent to: ( void ) fseek stream 0L SEEK_SET except that the error indicator for the stream is also cleared (see clearerr(3)).");
        scanfName = ("scanf - read in a formatted string from stdin");
        scanfSynopsis = ("#include <stdio.h>\n" + "\n" + "int scanf(const char * format, ...);\n" + "\n" + "int fscanf(FILE * stream, const char * format, ...);\n" + "\n" + "int sscanf(const char * str, const char * format, ...);");
        scanfDescription = ("In C programming language, scanf() function is used to read character, string, numeric data from keyboard" +
                "\n" + "The format specifier %d is used in scanf() statement. So that, the value entered is received as an integer and %s for string.");
        setbufName = ("setbuf, setbuffer, setlinebuf, setvbuf - stream buffering operations");
        setbufSynopsis = ("#include <stdio.h>\n" + "\n" + "void setbuf(FILE * stream, char * buf);\n" + "\n" + "void setbuffer(FILE * stream, char * buf, size_t size);\n" + "\n" + "void setlinebuf(FILE * stream);\n" + "\n" + "int setvbuf(FILE * stream, char * buf, int mode, size_t size);");
        setbufDescription = ("The three types of buffering available are unbuffered, block buffered, and line buffered. When an output stream is unbuffered, information appears on the destination file or terminal as soon as written; when it is block buffered many characters are saved up and written as a block; when it is line buffered characters are saved up until a newline is output or input is read from any stream attached to a terminal device (typically stdin). The function fflush(3) may be used to force the block out early. (See fclose(3).) Normally all files are block buffered. When the first I/O operation occurs on a file, malloc(3) is called, and a buffer is obtained. If a stream refers to a terminal (as stdout normally does) it is line buffered. The standard error stream stderr is always unbuffered by default.\n" +
                "\n" + "The setvbuf() function may be used on any open stream to change its buffer. The mode argument must be one of the following three macros:\n" +
                "\n" + "\\*_IONBF\\* unbuffered\n" +
                "\n" + "\\*_IOLBF\\* line buffered\n" +
                "\n" + "\\*_IOFBF\\* fully buffered\n" +
                "\n" + "Except for unbuffered files, the buf argument should point to a buffer at least size bytes long; this buffer will be used instead of the current buffer. If the argument buf is NULL, only the mode is affected; a new buffer will be allocated on the next read or write operation. The setvbuf() function may be used only after opening a stream and before any other operations have been performed on it.\n" +
                "\n" + "The other three calls are, in effect, simply aliases for calls to setvbuf(). The setbuf() function is exactly equivalent to the call\n" +
                "\n" + "setvbuf(stream, buf, buf ? _IOFBF : _IONBF, BUFSIZ);\n" +
                "\n" + "The setbuffer() function is the same, except that the size of the buffer is up to the caller, rather than being determined by the default *BUFSIZ\\*. The setlinebuf() function is exactly equivalent to the call:\n" +
                "\n" + "setvbuf(stream, NULL, _IOLBF, 0);");
        setvbufName = ("setbuf, setbuffer, setlinebuf, setvbuf - stream buffering operations");
        setvbufSynopsis = ("#include <stdio.h>\n" + "\n" + "void setbuf(FILE * stream, char * buf);\n" + "\n" + "void setbuffer(FILE * stream, char * buf, size_t size);\n" + "\n" + "void setlinebuf(FILE * stream);");
        setvbufDescription = ("The three types of buffering available are unbuffered, block buffered, and line buffered. When an output stream is unbuffered, information appears on the destination file or terminal as soon as written; when it is block buffered many characters are saved up and written as a block; when it is line buffered characters are saved up until a newline is output or input is read from any stream attached to a terminal device (typically stdin). The function fflush(3) may be used to force the block out early. (See fclose(3).) Normally all files are block buffered. When the first I/O operation occurs on a file, malloc(3) is called, and a buffer is obtained. If a stream refers to a terminal (as stdout normally does) it is line buffered. The standard error stream stderr is always unbuffered by default.\n" +
                "\n" + "The setvbuf() function may be used on any open stream to change its buffer. The mode argument must be one of the following three macros:\n" +
                "\n" + "\\*_IONBF\\* unbuffered\n" +
                "\n" + "\\*_IOLBF\\* line buffered\n" +
                "\n" + "\\*_IOFBF\\* fully buffered\n" +
                "\n" + "Except for unbuffered files, the buf argument should point to a buffer at least size bytes long; this buffer will be used instead of the current buffer. If the argument buf is NULL, only the mode is affected; a new buffer will be allocated on the next read or write operation. The setvbuf() function may be used only after opening a stream and before any other operations have been performed on it.\n" +
                "\n" + "The other three calls are, in effect, simply aliases for calls to setvbuf(). The setbuf() function is exactly equivalent to the call\n" +
                "\n" + "setvbuf(stream, buf, buf ? _IOFBF : _IONBF, BUFSIZ);\n" +
                "\n" + "The setbuffer() function is the same, except that the size of the buffer is up to the caller, rather than being determined by the default *BUFSIZ\\*. The setlinebuf() function is exactly equivalent to the call:\n" +
                "\n" + "setvbuf(stream, NULL, _IOLBF, 0);");
        snprintfName = ("printf, fprintf, sprintf, snprintf, vprintf, vfprintf, vsprintf, vsnprintf - formatted output conversion");
        snprintfSynopsis = ("#include <stdio.h>\n" + "\n" + "int printf(const char * format, ...);\n" + "\n" + "int fprintf(FILE * stream, const char * format, ...);\n" + "\n" + "int sprintf(char * str, const char * format, ...);\n" + "\n" + "int snprintf(char * str, size_t size, const char * format, ...);");
        snprintfDescription = ("The functions vprintf(), vfprintf(), vsprintf(), vsnprintf() are equivalent to the functions printf(), fprintf(), sprintf(), snprintf(), respectively, except that they are called with a va_list instead of a variable number of arguments. These functions do not call the va_end macro. Because they invoke the va_arg macro, the value of ap is undefined after the call." +
                "\n" + "The fprintf(), printf(), sprintf(), vprintf(), vfprintf(), and vsprintf() functions conform to C89 and C99. The snprintf() and vsnprintf() functions conform to C99.");
        sprintfName = ("sprintf - send formatted output to a string");
        sprintfSynopsis = ("#include <stdio.h>\n" + "\n" + "int printf(const char * format, ...);\n" + "\n" + "int fprintf(FILE * stream, const char * format, ...);\n" + "\n" + "int sprintf(char * str, const char * format, ...);\n" + "\n" + "int snprintf(char * str, size_t size, const char * format, ...);");
        sprintfDescription = ("The functions vprintf(), vfprintf(), vsprintf(), vsnprintf() are equivalent to the functions printf(), fprintf(), sprintf(), snprintf(), respectively, except that they are called with a va_list instead of a variable number of arguments. These functions do not call the va_end macro. Because they invoke the va_arg macro, the value of ap is undefined after the call." +
                "\n" + "The fprintf(), printf(), sprintf(), vprintf(), vfprintf(), and vsprintf() functions conform to C89 and C99. The snprintf() and vsnprintf() functions conform to C99.");
        sscanfName = ("scanf, fscanf, sscanf, vscanf, vsscanf, vfscanf - input format conversion");
        sscanfSynopsis = ("#include <stdio.h>\n" + "\n" + "int scanf(const char * format, ...);\n" + "\n" + "int fscanf(FILE * stream, const char * format, ...);\n" + "\n" + "int sscanf(const char * str, const char * format, ...);");
        sscanfDescription = ("The scanf() family of functions scans input according to format as described below. This format may contain conversion specifications; the results from such conversions, if any, are stored in the locations pointed to by the pointer arguments that follow format. Each pointer argument must be of a type that is appropriate for the value returned by the corresponding conversion specification.\n" +
                "\n" + "If the number of conversion specifications in format exceeds the number of pointer arguments, the results are undefined. If the number of pointer arguments exceeds the number of conversion specifications, then the excess pointer arguments are evaluated, but are otherwise ignored.\n" +
                "\n" + "The scanf() function reads input from the standard input stream stdin, fscanf() reads input from the stream pointer stream, and sscanf() reads its input from the character string pointed to by str.\n" +
                "\n" + "The vfscanf() function is analogous to vfprintf(3) and reads input from the stream pointer stream using a variable argument list of pointers (see stdarg(3). The vscanf() function scans a variable argument list from the standard input and the vsscanf() function scans it from a string; these are analogous to the vprintf(3) and vsprintf(3) functions respectively.");
        tmpfileName = ("tmpfile - create a temporary file");
        tmpfileSynopsis = ("#include <stdio.h>\n" + "*tmpfile FILE(void);");
        tmpfileDescription = ("The *tmpfile\\*() function opens a unique temporary file in binary read/write (w+b) mode. The file will be automatically deleted when it is closed or the program terminates.");
        tmpnamName = ("tmpnam - create a name for a temporary file");
        tmpnamSynopsis = ("#include <stdio.h>\n" + "char * tempnam(const char * dir, const char * pfx);");
        tmpnamDescription = ("The tempnam() function returns a pointer to a string that is a valid filename, and such that a file with this name did not exist when tempnam() checked. The filename suffix of the pathname generated will start with pfx in case pfx is a non-NULL string of at most five bytes. The directory prefix part of the pathname generated is required to be \"appropriate\" (often that at least implies writable).\n" +
                "\n" + "Attempts to find an appropriate directory go through the following steps:\n" +
                "\n" + "a) In case the environment variable TMPDIR exists and contains the name of an appropriate directory, that is used.\n" +
                "\n" + "b) Otherwise, if the dir argument is non-NULL and appropriate, it is used.\n" +
                "\n" + "c) Otherwise, P_tmpdir (as defined in <stdio.h>) is used when appropriate.\n" +
                "\n" + "d) Finally an implementation-defined directory may be used.\n" +
                "\n" + "The string returned by tempnam() is allocated using malloc(3) and hence should be freed by free(3).");
        ungetcName = ("fgetc, fgets, getc, getchar, gets, ungetc - input of characters and strings");
        ungetcSynopsis = ("#include <stdio.h>\n" + "\n" + "int fgetc(FILE * stream);\n" + "\n" + "char * fgets(char * s, int size, FILE * stream);\n" + "\n" + "int getc(FILE * stream);\n" + "\n" + "int getchar(void);\n" + "\n" + "char * gets(char * s);\n" + "\n" + "int ungetc(int c, FILE * stream);\n");
        ungetcDescription = ("fgetc() reads the next character from stream and returns it as an unsigned char cast to an int, or *EOF\\* on end of file or error.\n" +
                "\n" + "getc() is equivalent to fgetc() except that it may be implemented as a macro which evaluates stream more than once.\n" +
                "\n" + "getchar() is equivalent to *getc(\\*stdin\\*)\\*.\n" +
                "\n" + "gets() reads a line from stdin into the buffer pointed to by s until either a terminating newline or *EOF\\*, which it replaces with a null byte (\\0). No check for buffer overrun is performed (see BUGS below).\n" +
                "\n" + "fgets() reads in at most one less than size characters from stream and stores them into the buffer pointed to by s. Reading stops after an *EOF\\* or a newline. If a newline is read, it is stored into the buffer. A terminating null byte (\\0) is stored after the last character in the buffer.\n" +
                "\n" + "ungetc() pushes c back to stream, cast to unsigned char, where it is available for subsequent read operations. Pushed-back characters will be returned in reverse order; only one pushback is guaranteed.\n" +
                "\n" + "Calls to the functions described here can be mixed with each other and with calls to other input functions from the stdio library for the same input stream.");
        vfprintfName = ("printf, fprintf, sprintf, snprintf, vprintf, vfprintf, vsprintf, vsnprintf - formatted output conversion");
        vfprintfSynopsis = ("#include <stdarg.h>\n" + "\n" + "int vprintf(const char * format, va_list ap);\n" + "\n" + "int vfprintf(FILE * stream, const char * format, va_list ap);\n" + "\n" + "int vsprintf(char * str, const char * format, va_list ap);\n" + "\n" + "int vsnprintf(char * str, size_t size, const char * format, va_list ap);\n");
        vfprintfDescription = ("The functions vprintf(), vfprintf(), vsprintf(), vsnprintf() are equivalent to the functions printf(), fprintf(), sprintf(), snprintf(), respectively, except that they are called with a va_list instead of a variable number of arguments. These functions do not call the va_end macro. Because they invoke the va_arg macro, the value of ap is undefined after the call." +
                "\n" + "The fprintf(), printf(), sprintf(), vprintf(), vfprintf(), and vsprintf() functions conform to C89 and C99. The snprintf() and vsnprintf() functions conform to C99.");
        vfscanfName = ("scanf, fscanf, sscanf, vscanf, vsscanf, vfscanf - input format conversion");
        vfscanfSynopsis = ("#include <stdarg.h>\n" + "\n" + "int vscanf(const char * format, va_list ap);\n" + "\n" + "int vsscanf(const char * str, const char * format, va_list ap);\n" + "\n" + "int vfscanf(FILE * stream, const char * format, va_list ap);\n");
        vfscanfDescription = ("The scanf() family of functions scans input according to format as described below. This format may contain conversion specifications; the results from such conversions, if any, are stored in the locations pointed to by the pointer arguments that follow format. Each pointer argument must be of a type that is appropriate for the value returned by the corresponding conversion specification.\n" +
                "\n" + "If the number of conversion specifications in format exceeds the number of pointer arguments, the results are undefined. If the number of pointer arguments exceeds the number of conversion specifications, then the excess pointer arguments are evaluated, but are otherwise ignored.\n" +
                "\n" + "The scanf() function reads input from the standard input stream stdin, fscanf() reads input from the stream pointer stream, and sscanf() reads its input from the character string pointed to by str.\n" +
                "\n" + "The vfscanf() function is analogous to vfprintf(3) and reads input from the stream pointer stream using a variable argument list of pointers (see stdarg(3). The vscanf() function scans a variable argument list from the standard input and the vsscanf() function scans it from a string; these are analogous to the vprintf(3) and vsprintf(3) functions respectively.");
        vprintfName = ("printf, fprintf, sprintf, snprintf, vprintf, vfprintf, vsprintf, vsnprintf - formatted output conversion");
        vprintfSynopsis = ("#include <stdarg.h>\n" + "\n" + "int vprintf(const char * format, va_list ap);\n" + "\n" + "int vfprintf(FILE * stream, const char * format, va_list ap);\n" + "\n" + "int vsprintf(char * str, const char * format, va_list ap);\n" + "\n" + "int vsnprintf(char * str, size_t size, const char * format, va_list ap);\n");
        vprintfDescription = ("The functions in the printf() family produce output according to a format as described below. The functions printf() and vprintf() write output to stdout, the standard output stream; fprintf() and vfprintf() write output to the given output stream; sprintf(), snprintf(), vsprintf() and vsnprintf() write to the character string str.\n" +
                "\n" + "The functions snprintf() and vsnprintf() write at most size bytes (including the terminating null byte (\\0)) to str.\n" +
                "\n" + "The functions vprintf(), vfprintf(), vsprintf(), vsnprintf() are equivalent to the functions printf(), fprintf(), sprintf(), snprintf(), respectively, except that they are called with a va_list instead of a variable number of arguments. These functions do not call the va_end macro. Because they invoke the va_arg macro, the value of ap is undefined after the call. See stdarg(3).\n" +
                "\n" + "These eight functions write the output under the control of a format string that specifies how subsequent arguments (or arguments accessed via the variable-length argument facilities of stdarg(3)) are converted for output.");
        vscanfName = ("scanf, fscanf, sscanf, vscanf, vsscanf, vfscanf - input format conversion");
        vscanfSynopsis = ("#include <stdarg.h>\n" + "int vscanf(const char * format, va_list ap);\n" + "\n" + "\n" + "int vsscanf(const char * str, const char * format, va_list ap);\n" + "\n" + "int vfscanf(FILE * stream, const char * format, va_list ap);\n");
        vscanfDescription = ("The scanf() family of functions scans input according to format as described below. This format may contain conversion specifications; the results from such conversions, if any, are stored in the locations pointed to by the pointer arguments that follow format. Each pointer argument must be of a type that is appropriate for the value returned by the corresponding conversion specification.\n" +
                "\n" + "If the number of conversion specifications in format exceeds the number of pointer arguments, the results are undefined. If the number of pointer arguments exceeds the number of conversion specifications, then the excess pointer arguments are evaluated, but are otherwise ignored.\n" +
                "\n" + "The scanf() function reads input from the standard input stream stdin, fscanf() reads input from the stream pointer stream, and sscanf() reads its input from the character string pointed to by str.\n" +
                "\n" + "The vfscanf() function is analogous to vfprintf(3) and reads input from the stream pointer stream using a variable argument list of pointers (see stdarg(3). The vscanf() function scans a variable argument list from the standard input and the vsscanf() function scans it from a string; these are analogous to the vprintf(3) and vsprintf(3) functions respectively.");
        vsnprintfName = ("printf, fprintf, sprintf, snprintf, vprintf, vfprintf, vsprintf, vsnprintf - formatted output conversion");
        vsnprintfSynopsis = ("#include <stdarg.h>\n" + "\n" + "int vprintf(const char * format, va_list ap);\n" + "\n" + "int vfprintf(FILE * stream, const char * format, va_list ap);\n" + "\n" + "int vsprintf(char * str, const char * format, va_list ap);\n" + "\n" + "int vsnprintf(char * str, size_t size, const char * format, va_list ap);\n");
        vsnprintfDescription = ("The functions in the printf() family produce output according to a format as described below. The functions printf() and vprintf() write output to stdout, the standard output stream; fprintf() and vfprintf() write output to the given output stream; sprintf(), snprintf(), vsprintf() and vsnprintf() write to the character string str.\n" +
                "\n" + "The functions snprintf() and vsnprintf() write at most size bytes (including the terminating null byte (\\0)) to str.\n" +
                "\n" + "The functions vprintf(), vfprintf(), vsprintf(), vsnprintf() are equivalent to the functions printf(), fprintf(), sprintf(), snprintf(), respectively, except that they are called with a va_list instead of a variable number of arguments. These functions do not call the va_end macro. Because they invoke the va_arg macro, the value of ap is undefined after the call. See stdarg(3).\n" +
                "\n" + "These eight functions write the output under the control of a format string that specifies how subsequent arguments (or arguments accessed via the variable-length argument facilities of stdarg(3)) are converted for output.");
        vsprintfName = ("printf, fprintf, sprintf, snprintf, vprintf, vfprintf, vsprintf, vsnprintf - formatted output conversion");
        vsprintfSynopsis = ("#include <stdarg.h>\n" + "\n" + "int vprintf(const char * format, va_list ap);\n" + "\n" + "int vfprintf(FILE * stream, const char * format, va_list ap);\n" + "\n" + "int vsprintf(char * str, const char * format, va_list ap);\n" + "\n" + "int vsnprintf(char * str, size_t size, const char * format, va_list ap);\n");
        vsprintfDescription = ("The functions in the printf() family produce output according to a format as described below. The functions printf() and vprintf() write output to stdout, the standard output stream; fprintf() and vfprintf() write output to the given output stream; sprintf(), snprintf(), vsprintf() and vsnprintf() write to the character string str.\n" +
                "\n" + "The functions snprintf() and vsnprintf() write at most size bytes (including the terminating null byte (\\0)) to str.\n" +
                "\n" + "The functions vprintf(), vfprintf(), vsprintf(), vsnprintf() are equivalent to the functions printf(), fprintf(), sprintf(), snprintf(), respectively, except that they are called with a va_list instead of a variable number of arguments. These functions do not call the va_end macro. Because they invoke the va_arg macro, the value of ap is undefined after the call. See stdarg(3).\n" +
                "\n" + "These eight functions write the output under the control of a format string that specifies how subsequent arguments (or arguments accessed via the variable-length argument facilities of stdarg(3)) are converted for output.");
        vsscanfName = ("scanf, fscanf, sscanf, vscanf, vsscanf, vfscanf - input format conversion");
        vsscanfSynopsis = ("#include <stdarg.h>\n" + "int vscanf(const char * format, va_list ap);\n" + "\n" + "\n" + "int vsscanf(const char * str, const char * format, va_list ap);\n" + "\n" + "int vfscanf(FILE * stream, const char * format, va_list ap);\n");
        vsscanfDescription = ("The scanf() family of functions scans input according to format as described below. This format may contain conversion specifications; the results from such conversions, if any, are stored in the locations pointed to by the pointer arguments that follow format. Each pointer argument must be of a type that is appropriate for the value returned by the corresponding conversion specification.\n" +
                "\n" + "If the number of conversion specifications in format exceeds the number of pointer arguments, the results are undefined. If the number of pointer arguments exceeds the number of conversion specifications, then the excess pointer arguments are evaluated, but are otherwise ignored.\n" +
                "\n" + "The scanf() function reads input from the standard input stream stdin, fscanf() reads input from the stream pointer stream, and sscanf() reads its input from the character string pointed to by str.\n" +
                "\n" + "The vfscanf() function is analogous to vfprintf(3) and reads input from the stream pointer stream using a variable argument list of pointers (see stdarg(3). The vscanf() function scans a variable argument list from the standard input and the vsscanf() function scans it from a string; these are analogous to the vprintf(3) and vsprintf(3) functions respectively.");
        abortName = ("abort - cause abnormal process termination");

        abortSynopsis = ("#include <stdlib.h>\n" + "void abort(void);");
        abortDescription = ("The abort() first unblocks the SIGABRT signal, and then raises that signal for the calling process. This results in the abnormal termination of the process unless the SIGABRT signal is caught and the signal handler does not return (see longjmp(3)).\n" +
                "\n" + "If the abort() function causes process termination, all open streams are closed and flushed.\n" +
                "\n" + "If the SIGABRT signal is ignored, or caught by a handler that returns, the abort() function will still terminate the process. It does this by restoring the default disposition for SIGABRT and then raising the signal for a second time.");
        absName = ("abs - computes absolute value");
        absSynopsis = ("#include <stdlib.h>\n" + "\n" + "int abs(int j);\n" + "\n" + "long int labs(long int j);\n" + "\n" + "long long int llabs(long long int j);\n");
        absDescription = ("The abs() function computes the absolute value of the integer argument j. The labs(), llabs() and imaxabs() functions compute the absolute value of the argument j of the appropriate integer type for the function.");
        atexitName = ("atexit - register a function to be called at normal process termination");
        atexitSynopsis = ("#include <stdlib.h>\n" + "int atexit(void ( * ) ( void ) function);");
        atexitDescription = ("The atexit() function registers the given function to be called at normal process termination, either via exit(3) or via return from the program’s main(). Functions so registered are called in the reverse order of their registration; no arguments are passed.\n" +
                "\n" + "The same function may be registered multiple times: it is called once for each registration.\n" +
                "\n" + "POSIX.1-2001 requires that an implementation allow at least *ATEXIT_MAX\\* (32) such functions to be registered. The actual limit supported by an implementation can be obtained using sysconf(3).\n" +
                "\n" + "When a child process is created via fork(2), it inherits copies of its parent’s registrations. Upon a successful call to one of the exec(3) functions, all registrations are removed.");
        atofName = ("atof - convert a string to a double");
        atofSynopsis = ("#include <stdlib.h>\n" + "double atof(const char * nptr);");
        atofDescription = ("The atof() function converts the initial portion of the string pointed to by nptr to double. The behavior is the same as\n" +
                "\n" + "strtod(nptr, NULL);\n" + "\n" + "except that atof() does not detect errors.");
        atoiName = ("atoi - convert a string to an integer");
        atoiSynopsis = ("#include <stdlib.h>\n" + "\n" + "int atoi(const char * nptr);\n" + "\n" + "long atol(const char * nptr);\n" + "\n" + "long long atoll(const char * nptr);\n" + "\n" + "long long atoq(const char * nptr);\n");
        atoiDescription = ("The atoi() function converts the initial portion of the string pointed to by nptr to int. The behavior is the same as\n" +
                "\n" + "strtol(nptr, NULL, 10);\n" + "\n" + "except that atoi() does not detect errors.\n" +
                "\n" + "The atol() and atoll() functions behave the same as atoi(), except that they convert the initial portion of the string to their return type of long or long long. atoq() is an obsolete name for atoll().");
        atolName = ("atoi, atol, atoll, atoq - convert a string to an integer");
        atolSynopsis = ("#include <stdlib.h>\n" + "\n" + "int atoi(const char * nptr);\n" + "\n" + "long atol(const char * nptr);\n" + "\n" + "long long atoll(const char * nptr);\n" + "\n" + "long long atoq(const char * nptr);\n");
        atolDescription = ("The atoi() function converts the initial portion of the string pointed to by nptr to int. The behavior is the same as\n" +
                "\n" + "strtol(nptr, NULL, 10);\n" + "\n" + "except that atoi() does not detect errors.\n" +
                "\n" + "The atol() and atoll() functions behave the same as atoi(), except that they convert the initial portion of the string to their return type of long or long long. atoq() is an obsolete name for atoll().");
        atollName = ("atoi, atol, atoll, atoq - convert a string to an integer");
        atollSynopsis = ("#include <stdlib.h>\n" + "\n" + "int atoi(const char * nptr);\n" + "\n" + "long atol(const char * nptr);\n" + "\n" + "long long atoll(const char * nptr);\n" + "\n" + "long long atoq(const char * nptr);\n");
        atollDescription = ("The atoi() function converts the initial portion of the string pointed to by nptr to int. The behavior is the same as\n" +
                "\n" + "strtol(nptr, NULL, 10);\n" + "\n" + "except that atoi() does not detect errors.\n" +
                "\n" + "The atol() and atoll() functions behave the same as atoi(), except that they convert the initial portion of the string to their return type of long or long long. atoq() is an obsolete name for atoll().");
        bsearchName = ("bsearch - binary search of a sorted array");
        bsearchSynopsis = ("#include <stdlib.h>\n" + "void * bsearch(const void * key, const void * base, size_t nmemb, size_t size, int ( * ) ( const void *, const void *) compar);\n");
        bsearchDescription = ("The bsearch() function searches an array of nmemb objects, the initial member of which is pointed to by base, for a member that matches the object pointed to by key. The size of each member of the array is specified by size.\n" +
                "\n" + "The contents of the array should be in ascending sorted order according to the comparison function referenced by compar. The compar routine is expected to have two arguments which point to the key object and to an array member, in that order, and should return an integer less than, equal to, or greater than zero if the key object is found, respectively, to be less than, to match, or be greater than the array member.");
        callocName = ("calloc - allocate memory and set it to zero");
        callocSynopsis = ("#include <stdlib.h>\n" + "\n" + "void * malloc(size_t size);\n" + "\n" + "void free(void * ptr);\n" + "\n" + "void * calloc(size_t nmemb, size_t size);\n" + "\n" + "void * realloc(void * ptr, size_t size);\n");
        callocDescription = ("The malloc() function allocates size bytes and returns a pointer to the allocated memory. The memory is not initialized. If size is 0, then malloc() returns either NULL, or a unique pointer value that can later be successfully passed to free().\n" +
                "\n" + "The free() function frees the memory space pointed to by ptr, which must have been returned by a previous call to malloc(), calloc() or realloc(). Otherwise, or if free(ptr) has already been called before, undefined behavior occurs. If ptr is NULL, no operation is performed.\n" +
                "\n" + "The calloc() function allocates memory for an array of nmemb elements of size bytes each and returns a pointer to the allocated memory. The memory is set to zero. If nmemb or size is 0, then calloc() returns either NULL, or a unique pointer value that can later be successfully passed to free().\n" +
                "\n" + "The realloc() function changes the size of the memory block pointed to by ptr to size bytes. The contents will be unchanged in the range from the start of the region up to the minimum of the old and new sizes. If the new size is larger than the old size, the added memory will not be initialized. If ptr is NULL, then the call is equivalent to malloc(size), for all values of size; if size is equal to zero, and ptr is not NULL, then the call is equivalent to free(ptr). Unless ptr is NULL, it must have been returned by an earlier call to malloc(), calloc() or realloc(). If the area pointed to was moved, a free(ptr) is done.");
        divName = ("div, ldiv, lldiv, imaxdiv - compute quotient and remainder of an integer division");
        divSynopsis = ("#include <stdlib.h>\n" + "\n" + "div_t div(int numerator, int denominator);\n" + "\n" + "ldiv_t ldiv(long numerator, long denominator);\n" + "\n" + "lldiv_t lldiv(long long numerator, long long denominator);\n");
        divDescription = ("The div() function computes the value numerator/denominator and returns the quotient and remainder in a structure named div_t that contains two integer members (in unspecified order) named quot and rem. The quotient is rounded toward zero. The result satisfies quot\\*denominator+rem = numerator.\n" +
                "\n" + "The ldiv(), lldiv(), and imaxdiv() functions do the same, dividing numbers of the indicated type and returning the result in a structure of the indicated name, in all cases with fields quot and rem of the same type as the function arguments.");
        drand48Name = ("drand48 - returns a pseudorandom integer using 48-bit integer arithmetic");
        drand48Synopsis = ("#include <stdlib.h>\n" + "\n" + "double drand48(void);\n" + "\n" + "double erand48(unsigned short xsubi[3]);\n" + "\n" + "int lrand48(void);\n" + "\n" + "long int nrand48(unsigned short xsubi[3]);\n" + "\n" + "long int mrand48(void);\n" + "\n" + "long int jrand48(unsigned short xsubi[3]);\n" + "\n" + "void srand48(long int seedval);\n" + "\n" + "unsigned short * seed48(unsigned short seed16v[3]);\n" + "\n" + "void lcong48(unsigned short param[7]);\n");
        drand48Description = ("These functions generate pseudo-random numbers using the linear congruential algorithm and 48-bit integer arithmetic.\n" +
                "\n" + "The drand48() and erand48() functions return nonnegative double-precision floating-point values uniformly distributed between [0.0,1.0).\n" +
                "\n" + "The lrand48() and nrand48() functions return nonnegative long integers uniformly distributed between 0 and 231.\n" +
                "\n" + "The mrand48() and jrand48() functions return signed long integers uniformly distributed between -231 and 231.\n" +
                "\n" + "The srand48(), seed48() and lcong48() functions are initialization functions, one of which should be called before using drand48(), lrand48() or mrand48(). The functions erand48(), nrand48() and jrand48() do not require an initialization function to be called first.\n" +
                "\n" + "All the functions work by generating a sequence of 48-bit integers, Xi, according to the linear congruential formula:\n" + "\n" + "Xn+1 = (aXn + c) mod m, where n >= 0.\n" +
                "\n" + "The parameter m = 248, hence 48-bit integer arithmetic is performed. Unless lcong48() is called, a and c are given by:\n" +
                "\n" + "a = 0x5DEECE66D c = 0xB.\n" + "\n" + "The value returned by any of the functions drand48(), erand48(), lrand48(), nrand48(), mrand48() or jrand48() is computed by first generating the next 48-bit Xi in the sequence. Then the appropriate number of bits, according to the type of data item to be returned, is copied from the high-order bits of Xi and transformed into the returned value.\n" +
                "\n" + "The functions drand48(), lrand48() and mrand48() store the last 48-bit Xi generated in an internal buffer. The functions erand48(), nrand48() and jrand48() require the calling program to provide storage for the successive Xi values in the array argument xsubi. The functions are initialized by placing the initial value of Xi into the array before calling the function for the first time.\n" +
                "\n" + "The initializer function srand48() sets the high order 32-bits of Xi to the argument seedval. The low order 16-bits are set to the arbitrary value 0x330E.\n" +
                "\n" + "The initializer function seed48() sets the value of Xi to the 48-bit value specified in the array argument seed16v. The previous value of Xi is copied into an internal buffer and a pointer to this buffer is returned by seed48().\n" +
                "\n" + "The initialization function lcong48() allows the user to specify initial values for Xi, a and c. Array argument elements param[0-2] specify Xi, param[3-5] specify a, and param[6] specifies c. After lcong48() has been called, a subsequent call to either srand48() or seed48() will restore the standard values of a and c.");
        exitName = ("exit - cause normal process termination");
        exitSynopsis = ("#include <stdlib.h>\n" + "void exit(int status);\n");
        exitDescription = ("The exit() function causes normal process termination and the value of status & 0377 is returned to the parent (see wait(2)).\n" +
                "\n" + "All functions registered with atexit(3) and on_exit(3) are called, in the reverse order of their registration. (It is possible for one of these functions to use atexit(3) or on_exit(3) to register an additional function to be executed during exit processing; the new registration is added to the front of the list of functions that remain to be called.) If one of these functions does not return (e.g., it calls _exit(2), or kills itself with a signal), then none of the remaining functions is called, and further exit processing (in particular, flushing of stdio(3) streams) is abandoned. If a function has been registered multiple times using atexit(3) or on_exit(3), then it is called as many times as it was registered.\n" +
                "\n" + "All open stdio(3) streams are flushed and closed. Files created by tmpfile(3) are removed.\n" +
                "\n" + "The C standard specifies two constants, *EXIT_SUCCESS\\* and *EXIT_FAILURE\\*, that may be passed to exit() to indicate successful or unsuccessful termination, respectively.");
        freeName = ("free - free dynamically allocated memory");
        freeSynopsis = ("#include <stdlib.h>\n" + "\n" + "void * malloc(size_t size);\n" + "\n" + "void free(void * ptr);\n" + "\n" + "void * calloc(size_t nmemb, size_t size);\n" + "\n" + "void * realloc(void * ptr, size_t size);\n");
        freeDescription = ("The malloc() function allocates size bytes and returns a pointer to the allocated memory. The memory is not initialized. If size is 0, then malloc() returns either NULL, or a unique pointer value that can later be successfully passed to free().\n" +
                "\n" + "The free() function frees the memory space pointed to by ptr, which must have been returned by a previous call to malloc(), calloc() or realloc(). Otherwise, or if free(ptr) has already been called before, undefined behavior occurs. If ptr is NULL, no operation is performed.\n" +
                "\n" + "The calloc() function allocates memory for an array of nmemb elements of size bytes each and returns a pointer to the allocated memory. The memory is set to zero. If nmemb or size is 0, then calloc() returns either NULL, or a unique pointer value that can later be successfully passed to free().\n" +
                "\n" + "The realloc() function changes the size of the memory block pointed to by ptr to size bytes. The contents will be unchanged in the range from the start of the region up to the minimum of the old and new sizes. If the new size is larger than the old size, the added memory will not be initialized. If ptr is NULL, then the call is equivalent to malloc(size), for all values of size; if size is equal to zero, and ptr is not NULL, then the call is equivalent to free(ptr). Unless ptr is NULL, it must have been returned by an earlier call to malloc(), calloc() or realloc(). If the area pointed to was moved, a free(ptr) is done.");




        getenvName = ("getenv, secure_getenv - get an environment variable");
        getenvSynopsis = ("#include <stdlib.h>\n" + "\n" + "char * getenv(const char * name);\n" + "\n" + "char * secure_getenv(const char * name);\n");
        getenvDescription = ("The getenv() function searches the environment list to find the environment variable name, and returns a pointer to the corresponding value string.\n" +
                "\n" + "The GNU-specific secure_getenv() function is just like getenv() except that it returns NULL in cases where \"secure execution\" is required. Secure execution is required if one of the following conditions was true when the program run by the calling process was loaded:\n" +
                "\n" + "the process’s effective user ID did not match its real user ID or the process’s effective group ID did not match its real group ID (typically this is the result of executing a set-user-ID or set-group-ID program);\n" +
                "\n" + "the effective capability bit was set on the executable file; or\n" +
                "\n" + "the process has a nonempty permitted capability set.\n" + "\n" + "Secure execution may also required if triggered by some Linux security modules.\n" +
                "\n" + "The secure_getenv() function is intended for use in general-purpose libraries to avoid vulnerabilities that could occur if set-user-ID or set-group-ID programs accidentally trusted the environment.");


        labsName = ("abs, labs, llabs, imaxabs - compute the absolute value of an integer");
        labsSynopsis = ("#include <stdlib.h>\n" + "\n" + "int abs(int j);\n" + "\n" + "long int labs(long int j);\n" + "\n" + "long long int llabs(long long int j);\n");
        labsDescription = ("The abs() function computes the absolute value of the integer argument j. The labs(), llabs() and imaxabs() functions compute the absolute value of the argument j of the appropriate integer type for the function.");
        ldivName = ("div, ldiv, lldiv, imaxdiv - compute quotient and remainder of an integer division");
        ldivSynopsis = ("#include <stdlib.h>\n" + "\n" + "div_t div(int numerator, int denominator);\n" + "\n" + "ldiv_t ldiv(long numerator, long denominator);\n" + "\n" + "lldiv_t lldiv(long long numerator, long long denominator);\n");
        ldivDescription = ("The div() function computes the value numerator/denominator and returns the quotient and remainder in a structure named div_t that contains two integer members (in unspecified order) named quot and rem. The quotient is rounded toward zero. The result satisfies quot\\*denominator+rem = numerator.\n" +
                "\n" + "The ldiv(), lldiv(), and imaxdiv() functions do the same, dividing numbers of the indicated type and returning the result in a structure of the indicated name, in all cases with fields quot and rem of the same type as the function arguments.");
        llabsName = ("abs, labs, llabs, imaxabs - compute the absolute value of an integer");
        llabsSynopsis = ("#include <stdlib.h>\n" + "\n" + "int abs(int j);\n" + "\n" + "long int labs(long int j);\n" + "\n" + "long long int llabs(long long int j);\n");
        llabsDescription = ("The abs() function computes the absolute value of the integer argument j. The labs(), llabs() and imaxabs() functions compute the absolute value of the argument j of the appropriate integer type for the function.");
        lldivName = ("div, ldiv, lldiv, imaxdiv - compute quotient and remainder of an integer division");
        lldivSynopsis = ("#include <stdlib.h>\n" + "\n" + "div_t div(int numerator, int denominator);\n" + "\n" + "ldiv_t ldiv(long numerator, long denominator);\n" + "\n" + "lldiv_t lldiv(long long numerator, long long denominator);\n");
        lldivDescription = ("The div() function computes the value numerator/denominator and returns the quotient and remainder in a structure named div_t that contains two integer members (in unspecified order) named quot and rem. The quotient is rounded toward zero. The result satisfies quot\\*denominator+rem = numerator.\n" +
                "\n" + "The ldiv(), lldiv(), and imaxdiv() functions do the same, dividing numbers of the indicated type and returning the result in a structure of the indicated name, in all cases with fields quot and rem of the same type as the function arguments.");
        mallocName = ("malloc - allocate memory");
        mallocSynopsis = ("#include <stdlib.h>\n" + "\n" + "void * malloc(size_t size);\n" + "\n" + "void free(void * ptr);\n" + "\n" + "void * calloc(size_t nmemb, size_t size);\n" + "\n" + "void * realloc(void * ptr, size_t size);\n");
        mallocDescription = ("The malloc() function allocates size bytes and returns a pointer to the allocated memory. The memory is not initialized. If size is 0, then malloc() returns either NULL, or a unique pointer value that can later be successfully passed to free().\n" +
                "\n" + "The free() function frees the memory space pointed to by ptr, which must have been returned by a previous call to malloc(), calloc() or realloc(). Otherwise, or if free(ptr) has already been called before, undefined behavior occurs. If ptr is NULL, no operation is performed.\n" +
                "\n" + "The calloc() function allocates memory for an array of nmemb elements of size bytes each and returns a pointer to the allocated memory. The memory is set to zero. If nmemb or size is 0, then calloc() returns either NULL, or a unique pointer value that can later be successfully passed to free().\n" +
                "\n" + "The realloc() function changes the size of the memory block pointed to by ptr to size bytes. The contents will be unchanged in the range from the start of the region up to the minimum of the old and new sizes. If the new size is larger than the old size, the added memory will not be initialized. If ptr is NULL, then the call is equivalent to malloc(size), for all values of size; if size is equal to zero, and ptr is not NULL, then the call is equivalent to free(ptr). Unless ptr is NULL, it must have been returned by an earlier call to malloc(), calloc() or realloc(). If the area pointed to was moved, a free(ptr) is done.");
        mblenName = ("mblen - determine number of bytes in next multibyte character");
        mblenSynopsis = ("#include <stdlib.h>\n" + "int mblen(const char * s, size_t n);\n");
        mblenDescription = ("If s is not a NULL pointer, the mblen() function inspects at most n bytes of the multibyte string starting at s and extracts the next complete multibyte character. It uses a static anonymous shift state known only to the mblen() function. If the multibyte character is not the null wide character, it returns the number of bytes that were consumed from s. If the multibyte character is the null wide character, it returns 0.\n" +
                "\n" + "If the n bytes starting at s do not contain a complete multibyte character, mblen() returns -1. This can happen even if n is greater than or equal to MB_CUR_MAX, if the multibyte string contains redundant shift sequences.\n" +
                "\n" + "If the multibyte string starting at s contains an invalid multibyte sequence before the next complete character, mblen() also returns -1.\n" +
                "\n" + "If s is a NULL pointer, the mblen() function resets the shift state, known to only this function, to the initial state, and returns nonzero if the encoding has nontrivial shift state, or zero if the encoding is stateless.");
        mbstowcsName = ("mbstowcs - convert a multibyte string to a wide-character string");
        mbstowcsSynopsis = ("#include <stdlib.h>\n" + "size_t mbstowcs(wchar_t * dest, const char * src, size_t n);\n");
        mbstowcsDescription = ("If dest is not a NULL pointer, the mbstowcs() function converts the multibyte string src to a wide-character string starting at dest. At most n wide characters are written to dest. The conversion starts in the initial state. The conversion can stop for three reasons:\n" +
                "\n" + "1. An invalid multibyte sequence has been encountered. In this case (size_t) -1 is returned.\n" +
                "\n" + "2. n non-L'\\0' wide characters have been stored at dest. In this case the number of wide characters written to dest is returned, but the shift state at this point is lost.\n" +
                "\n" + "3. The multibyte string has been completely converted, including the terminating null wide character (\\0). In this case the number of wide characters written to dest, excluding the terminating null wide character, is returned.\n" +
                "\n" + "The programmer must ensure that there is room for at least n wide characters at dest.\n" +
                "\n" + "If dest is NULL, n is ignored, and the conversion proceeds as above, except that the converted wide characters are not written out to memory, and that no length limit exists.\n" +
                "\n" + "In order to avoid the case 2 above, the programmer should make sure n is greater or equal to mbstowcs(NULL,src,0)+1.");
        mbtowcName = ("mbtowc - convert a multibyte sequence to a wide character");
        mbtowcSynopsis = ("#include <stdlib.h>\n" + "int mbtowc(wchar_t * pwc, const char * s, size_t n);\n");
        mbtowcDescription = ("The main case for this function is when s is not NULL and pwc is not NULL. In this case, the mbtowc() function inspects at most n bytes of the multibyte string starting at s, extracts the next complete multibyte character, converts it to a wide character and stores it at \\*pwc. It updates an internal shift state known only to the mbtowc() function. If s does not point to a null byte (\\0), it returns the number of bytes that were consumed from s, otherwise it returns 0.\n" +
                "\n" + "If the n bytes starting at s do not contain a complete multibyte character, or if they contain an invalid multibyte sequence, mbtowc() returns -1. This can happen even if n >= MB_CUR_MAX, if the multibyte string contains redundant shift sequences.\n" +
                "\n" + "A different case is when s is not NULL but pwc is NULL. In this case the mbtowc() function behaves as above, except that it does not store the converted wide character in memory.\n" +
                "\n" + "A third case is when s is NULL. In this case, pwc and n are ignored. The mbtowc() function resets the shift state, only known to this function, to the initial state, and returns nonzero if the encoding has nontrivial shift state, or zero if the encoding is stateless.");
        qsortName = ("qsort, qsort_r - sort an array");
        qsortSynopsis = ("#include <stdlib.h>\n" + "\n" + "void qsort(void * base, size_t nmemb, size_t size, int ( * ) ( const void *, const void *) compar);\n" + "\n" + "void qsort_r(void * base, size_t nmemb, size_t size, int ( * ) ( const void *, const void *, void *) compar, void * arg);\n");
        qsortDescription = ("The qsort() function sorts an array with nmemb elements of size size. The base argument points to the start of the array.\n" +
                "\n" + "The contents of the array are sorted in ascending order according to a comparison function pointed to by compar, which is called with two arguments that point to the objects being compared.\n" +
                "\n" + "The comparison function must return an integer less than, equal to, or greater than zero if the first argument is considered to be respectively less than, equal to, or greater than the second. If two members compare as equal, their order in the sorted array is undefined.\n" +
                "\n" + "The qsort_r() function is identical to qsort() except that the comparison function compar takes a third argument. A pointer is passed to the comparison function via arg. In this way, the comparison function does not need to use global variables to pass through arbitrary arguments, and is therefore reentrant and safe to use in threads.");
        randName = ("rand - returns a pseudorandom integer");
        randSynopsis = ("#include <stdlib.h>\n" + "\n" + "int rand(void);\n" + "\n" + "int rand_r(unsigned int * seedp);\n" + "\n" + "void srand(unsigned int seed);\n");
        randDescription = ("The rand() function returns a pseudo-random integer in the range 0 to *RAND_MAX\\* inclusive (i.e., the mathematical range [0, *RAND_MAX\\*]).\n" +
                "\n" + "The srand() function sets its argument as the seed for a new sequence of pseudo-random integers to be returned by rand(). These sequences are repeatable by calling srand() with the same seed value.\n" +
                "\n" + "If no seed value is provided, the rand() function is automatically seeded with a value of 1.\n" +
                "\n" + "The function rand() is not reentrant or thread-safe, since it uses hidden state that is modified on each call. This might just be the seed value to be used by the next call, or it might be something more elaborate. In order to get reproducible behavior in a threaded application, this state must be made explicit; this can be done using the reentrant function rand_r().\n" +
                "\n" + "Like rand(), rand_r() returns a pseudo-random integer in the range [0, *RAND_MAX\\*]. The seedp argument is a pointer to an unsigned int that is used to store state between calls. If rand_r() is called with the same initial value for the integer pointed to by seedp, and that value is not modified between calls, then the same pseudo-random sequence will result.\n" +
                "\n" + "The value pointed to by the seedp argument of rand_r() provides only a very small amount of state, so this function will be a weak pseudo-random generator. Try drand48_r(3) instead.");
        reallocName = ("realloc - reallocate memory previously allocated");
        reallocSynopsis = ("#include <stdlib.h>\n" + "\n" + "void * malloc(size_t size);\n" + "\n" + "void free(void * ptr);\n" + "\n" + "void * calloc(size_t nmemb, size_t size);\n" + "\n" + "void * realloc(void * ptr, size_t size);\n");
        reallocDescription = ("The malloc() function allocates size bytes and returns a pointer to the allocated memory. The memory is not initialized. If size is 0, then malloc() returns either NULL, or a unique pointer value that can later be successfully passed to free().\n" +
                "\n" + "The free() function frees the memory space pointed to by ptr, which must have been returned by a previous call to malloc(), calloc() or realloc(). Otherwise, or if free(ptr) has already been called before, undefined behavior occurs. If ptr is NULL, no operation is performed.\n" +
                "\n" + "The calloc() function allocates memory for an array of nmemb elements of size bytes each and returns a pointer to the allocated memory. The memory is set to zero. If nmemb or size is 0, then calloc() returns either NULL, or a unique pointer value that can later be successfully passed to free().\n" +
                "\n" + "The realloc() function changes the size of the memory block pointed to by ptr to size bytes. The contents will be unchanged in the range from the start of the region up to the minimum of the old and new sizes. If the new size is larger than the old size, the added memory will not be initialized. If ptr is NULL, then the call is equivalent to malloc(size), for all values of size; if size is equal to zero, and ptr is not NULL, then the call is equivalent to free(ptr). Unless ptr is NULL, it must have been returned by an earlier call to malloc(), calloc() or realloc(). If the area pointed to was moved, a free(ptr) is done.");
        srandName = ("srand - seed the pseudorandom generator `rand`");
        srandSynopsis = ("#include <stdlib.h>\n" + "\n" + "int rand(void);\n" + "\n" + "int rand_r(unsigned int * seedp);\n" + "\n" + "void srand(unsigned int seed);\n");
        srandDescription = ("The rand() function returns a pseudo-random integer in the range 0 to *RAND_MAX\\* inclusive (i.e., the mathematical range [0, *RAND_MAX\\*]).\n" +
                "\n" + "The srand() function sets its argument as the seed for a new sequence of pseudo-random integers to be returned by rand(). These sequences are repeatable by calling srand() with the same seed value.\n" +
                "\n" + "If no seed value is provided, the rand() function is automatically seeded with a value of 1.\n" +
                "\n" + "The function rand() is not reentrant or thread-safe, since it uses hidden state that is modified on each call. This might just be the seed value to be used by the next call, or it might be something more elaborate. In order to get reproducible behavior in a threaded application, this state must be made explicit; this can be done using the reentrant function rand_r().\n" +
                "\n" + "Like rand(), rand_r() returns a pseudo-random integer in the range [0, *RAND_MAX\\*]. The seedp argument is a pointer to an unsigned int that is used to store state between calls. If rand_r() is called with the same initial value for the integer pointed to by seedp, and that value is not modified between calls, then the same pseudo-random sequence will result.\n" +
                "\n" + "The value pointed to by the seedp argument of rand_r() provides only a very small amount of state, so this function will be a weak pseudo-random generator. Try drand48_r(3) instead.");
        srand48Name = ("srand48 - seeds the pseudorandom generator drand48()");
        srand48Synopsis = ("#include <stdlib.h>\n" + "\n" + "double drand48(void);\n" + "\n" + "double erand48(unsigned short xsubi[3]);\n" + "\n" + "int lrand48(void);\n" + "\n" + "long int nrand48(unsigned short xsubi[3]);\n" + "\n" + "long int mrand48(void);\n" + "\n" + "long int jrand48(unsigned short xsubi[3]);\n" + "\n" + "void srand48(long int seedval);\n" + "\n" + "unsigned short * seed48(unsigned short seed16v[3]);\n" + "\n" + "void lcong48(unsigned short param[7]);\n");
        srand48Description = ("These functions generate pseudo-random numbers using the linear congruential algorithm and 48-bit integer arithmetic.\n" +
                "\n" + "The drand48() and erand48() functions return nonnegative double-precision floating-point values uniformly distributed between [0.0,1.0).\n" +
                "\n" + "The lrand48() and nrand48() functions return nonnegative long integers uniformly distributed between 0 and 231.\n" +
                "\n" + "The mrand48() and jrand48() functions return signed long integers uniformly distributed between -231 and 231.\n" +
                "\n" + "The srand48(), seed48() and lcong48() functions are initialization functions, one of which should be called before using drand48(), lrand48() or mrand48(). The functions erand48(), nrand48() and jrand48() do not require an initialization function to be called first.\n" +
                "\n" + "All the functions work by generating a sequence of 48-bit integers, Xi, according to the linear congruential formula:\n" +
                "\n" + "Xn+1 = (aXn + c) mod m, where n >= 0.\n" +
                "\n" + "The parameter m = 248, hence 48-bit integer arithmetic is performed. Unless lcong48() is called, a and c are given by:\n" +
                "\n" + "a = 0x5DEECE66D c = 0xB.\n" +
                "\n" + "The value returned by any of the functions drand48(), erand48(), lrand48(), nrand48(), mrand48() or jrand48() is computed by first generating the next 48-bit Xi in the sequence. Then the appropriate number of bits, according to the type of data item to be returned, is copied from the high-order bits of Xi and transformed into the returned value.\n" +
                "\n" + "The functions drand48(), lrand48() and mrand48() store the last 48-bit Xi generated in an internal buffer. The functions erand48(), nrand48() and jrand48() require the calling program to provide storage for the successive Xi values in the array argument xsubi. The functions are initialized by placing the initial value of Xi into the array before calling the function for the first time.\n" +
                "\n" + "The initializer function srand48() sets the high order 32-bits of Xi to the argument seedval. The low order 16-bits are set to the arbitrary value 0x330E.\n" +
                "\n" + "The initializer function seed48() sets the value of Xi to the 48-bit value specified in the array argument seed16v. The previous value of Xi is copied into an internal buffer and a pointer to this buffer is returned by seed48().\n" +
                "\n" + "The initialization function lcong48() allows the user to specify initial values for Xi, a and c. Array argument elements param[0-2] specify Xi, param[3-5] specify a, and param[6] specifies c. After lcong48() has been called, a subsequent call to either srand48() or seed48() will restore the standard values of a and c.");
        strtodName = ("strtod, strtof, strtold - convert ASCII string to floating-point number");
        strtodSynopsis = ("#include <stdlib.h>\n" + "\n" + "double strtod(const char * nptr, char ** endptr);\n" + "\n" + "float strtof(const char * nptr, char ** endptr);\n" + "\n" + "long double strtold(const char * nptr, char ** endptr);\n");
        strtodDescription = ("The strtod(), strtof(), and strtold() functions convert the initial portion of the string pointed to by nptr to double, float, and long double representation, respectively.\n" +
                "\n" + "The expected form of the (initial portion of the) string is optional leading white space as recognized by isspace(3), an optional plus (+) or minus sign (-) and then either (i) a decimal number, or (ii) a hexadecimal number, or (iii) an infinity, or (iv) a NAN (not-a-number).\n" +
                "\n" + "A decimal number consists of a nonempty sequence of decimal digits possibly containing a radix character (decimal point, locale-dependent, usually .), optionally followed by a decimal exponent. A decimal exponent consists of an E or e, followed by an optional plus or minus sign, followed by a nonempty sequence of decimal digits, and indicates multiplication by a power of 10.\n" +
                "\n" + "A hexadecimal number consists of a \"0x\" or \"0X\" followed by a nonempty sequence of hexadecimal digits possibly containing a radix character, optionally followed by a binary exponent. A binary exponent consists of a P or p, followed by an optional plus or minus sign, followed by a nonempty sequence of decimal digits, and indicates multiplication by a power of 2. At least one of radix character and binary exponent must be present.\n" +
                "\n" + "An infinity is either \"INF\" or \"INFINITY\", disregarding case.\n" +
                "\n" + "A NAN is \"NAN\" (disregarding case) optionally followed by (, a sequence of characters, followed by ). The character string specifies in an implementation-dependent way the type of NAN.");
        strtofName = ("strtod, strtof, strtold - convert ASCII string to floating-point number");
        strtofSynopsis = ("#include <stdlib.h>\n" + "\n" + "double strtod(const char * nptr, char ** endptr);\n" + "\n" + "float strtof(const char * nptr, char ** endptr);\n" + "\n" + "long double strtold(const char * nptr, char ** endptr);\n");
        strtofDescription = ("The strtod(), strtof(), and strtold() functions convert the initial portion of the string pointed to by nptr to double, float, and long double representation, respectively.\n" +
                "\n" + "The expected form of the (initial portion of the) string is optional leading white space as recognized by isspace(3), an optional plus (+) or minus sign (-) and then either (i) a decimal number, or (ii) a hexadecimal number, or (iii) an infinity, or (iv) a NAN (not-a-number).\n" +
                "\n" + "A decimal number consists of a nonempty sequence of decimal digits possibly containing a radix character (decimal point, locale-dependent, usually .), optionally followed by a decimal exponent. A decimal exponent consists of an E or e, followed by an optional plus or minus sign, followed by a nonempty sequence of decimal digits, and indicates multiplication by a power of 10.\n" +
                "\n" + "A hexadecimal number consists of a \"0x\" or \"0X\" followed by a nonempty sequence of hexadecimal digits possibly containing a radix character, optionally followed by a binary exponent. A binary exponent consists of a P or p, followed by an optional plus or minus sign, followed by a nonempty sequence of decimal digits, and indicates multiplication by a power of 2. At least one of radix character and binary exponent must be present.\n" +
                "\n" + "An infinity is either \"INF\" or \"INFINITY\", disregarding case.\n" +
                "\n" + "A NAN is \"NAN\" (disregarding case) optionally followed by (, a sequence of characters, followed by ). The character string specifies in an implementation-dependent way the type of NAN.");
        strtolName = ("strtol, strtoll, strtoq - convert a string to a long integer");
        strtolSynopsis = ("#include <stdlib.h>\n" + "\n" + "long int strtol(const char * nptr, char ** endptr, int base);\n" + "\n" + "long long int strtoll(const char * nptr, char ** endptr, int base);\n");
        strtolDescription = ("The strtol() function converts the initial part of the string in nptr to a long integer value according to the given base, which must be between 2 and 36 inclusive, or be the special value 0.\n" +
                "\n" + "The string may begin with an arbitrary amount of white space (as determined by isspace(3)) followed by a single optional '+' or '-' sign. If base is zero or 16, the string may then include a \"0x\" prefix, and the number will be read in base 16; otherwise, a zero base is taken as 10 (decimal) unless the next character is '0', in which case it is taken as 8 (octal).\n" +
                "\n" + "The remainder of the string is converted to a long int value in the obvious manner, stopping at the first character which is not a valid digit in the given base. (In bases above 10, the letter 'A' in either upper or lower case represents 10, 'B' represents 11, and so forth, with 'Z' representing 35.)\n" +
                "\n" + "If endptr is not NULL, strtol() stores the address of the first invalid character in *endptr. If there were no digits at all, strtol() stores the original value of nptr in *endptr (and returns 0). In particular, if *nptr is not '\\0' but **endptr is '\\0' on return, the entire string is valid.\n" +
                "\n" + "The strtoll() function works just like the strtol() function but returns a long long integer value.");
        strtoldName = ("strtod, strtof, strtold - convert ASCII string to floating-point number");
        strtoldSynopsis = ("#include <stdlib.h>\n" + "\n" + "double strtod(const char * nptr, char ** endptr);\n" + "\n" + "float strtof(const char * nptr, char ** endptr);\n" + "\n" + "long double strtold(const char * nptr, char ** endptr);\n");
        strtoldDescription = ("The strtod(), strtof(), and strtold() functions convert the initial portion of the string pointed to by nptr to double, float, and long double representation, respectively.\n" +
                "\n" + "The expected form of the (initial portion of the) string is optional leading white space as recognized by isspace(3), an optional plus (+) or minus sign (-) and then either (i) a decimal number, or (ii) a hexadecimal number, or (iii) an infinity, or (iv) a NAN (not-a-number).\n" +
                "\n" + "A decimal number consists of a nonempty sequence of decimal digits possibly containing a radix character (decimal point, locale-dependent, usually .), optionally followed by a decimal exponent. A decimal exponent consists of an E or e, followed by an optional plus or minus sign, followed by a nonempty sequence of decimal digits, and indicates multiplication by a power of 10.\n" +
                "\n" + "A hexadecimal number consists of a \"0x\" or \"0X\" followed by a nonempty sequence of hexadecimal digits possibly containing a radix character, optionally followed by a binary exponent. A binary exponent consists of a P or p, followed by an optional plus or minus sign, followed by a nonempty sequence of decimal digits, and indicates multiplication by a power of 2. At least one of radix character and binary exponent must be present.\n" +
                "\n" + "An infinity is either \"INF\" or \"INFINITY\", disregarding case.\n" + "\n" + "A NAN is \"NAN\" (disregarding case) optionally followed by (, a sequence of characters, followed by ). The character string specifies in an implementation-dependent way the type of NAN.");
        strtollName = ("strtol, strtoll, strtoq - convert a string to a long integer");
        strtollSynopsis = ("#include <stdlib.h>\n" + "\n" + "long int strtol(const char * nptr, char ** endptr, int base);\n" + "\n" + "long long int strtoll(const char * nptr, char ** endptr, int base);\n");
        strtollDescription = ("The strtol() function converts the initial part of the string in nptr to a long integer value according to the given base, which must be between 2 and 36 inclusive, or be the special value 0.\n" +
                "\n" + "The string may begin with an arbitrary amount of white space (as determined by isspace(3)) followed by a single optional + or - sign. If base is zero or 16, the string may then include a \"0x\" prefix, and the number will be read in base 16; otherwise, a zero base is taken as 10 (decimal) unless the next character is 0, in which case it is taken as 8 (octal).\n" +
                "\n" + "The remainder of the string is converted to a long int value in the obvious manner, stopping at the first character which is not a valid digit in the given base. (In bases above 10, the letter A in either upper or lower case represents 10, B represents 11, and so forth, with Z representing 35.)\n" +
                "\n" + "If endptr is not NULL, strtol() stores the address of the first invalid character in *endptr. If there were no digits at all, strtol() stores the original value of nptr in \\*endptr (and returns 0). In particular, if \\*nptr is not \\0 but \\*\\*endptr is \\0 on return, the entire string is valid.\n" +
                "\n" + "The strtoll() function works just like the strtol() function but returns a long long integer value.");
        strtoulName = ("strtoul, strtoull, strtouq - convert a string to an unsigned long integer");
        strtoulSynopsis = ("#include <stdlib.h>\n" + "\n" + "unsigned long int strtoul(const char * nptr, char ** endptr, int base);\n" + "\n" + "unsigned long long int strtoull(const char * nptr, char ** endptr, int base);\n");
        strtoulDescription = ("The strtoul() function converts the initial part of the string in nptr to an unsigned long int value according to the given base, which must be between 2 and 36 inclusive, or be the special value 0.\n" +
                "\n" + "The string may begin with an arbitrary amount of white space (as determined by isspace(3)) followed by a single optional + or - sign. If base is zero or 16, the string may then include a \"0x\" prefix, and the number will be read in base 16; otherwise, a zero base is taken as 10 (decimal) unless the next character is 0, in which case it is taken as 8 (octal).\n" +
                "\n" + "The remainder of the string is converted to an unsigned long int value in the obvious manner, stopping at the first character which is not a valid digit in the given base. (In bases above 10, the letter A in either upper or lower case represents 10, B represents 11, and so forth, with Z representing 35.)\n" +
                "\n" + "If endptr is not NULL, strtoul() stores the address of the first invalid character in *endptr. If there were no digits at all, strtoul() stores the original value of nptr in \\*endptr (and returns 0). In particular, if \\*nptr is not \\0 but \\*\\*endptr is \\0 on return, the entire string is valid.\n" +
                "\n" + "The strtoull() function works just like the strtoul() function but returns an unsigned long long int value.");
        strtoullName = ("strtoul, strtoull, strtouq - convert a string to an unsigned long integer");
        strtoullSynopsis = ("#include <stdlib.h>\n" + "\n" + "unsigned long int strtoul(const char * nptr, char ** endptr, int base);\n" + "\n" + "unsigned long long int strtoull(const char * nptr, char ** endptr, int base);\n");
        strtoullDescription = ("The strtoul() function converts the initial part of the string in nptr to an unsigned long int value according to the given base, which must be between 2 and 36 inclusive, or be the special value 0.\n" +
                "\n" + "The string may begin with an arbitrary amount of white space (as determined by isspace(3)) followed by a single optional + or - sign. If base is zero or 16, the string may then include a \"0x\" prefix, and the number will be read in base 16; otherwise, a zero base is taken as 10 (decimal) unless the next character is 0, in which case it is taken as 8 (octal).\n" +
                "\n" + "The remainder of the string is converted to an unsigned long int value in the obvious manner, stopping at the first character which is not a valid digit in the given base. (In bases above 10, the letter A in either upper or lower case represents 10, B represents 11, and so forth, with Z representing 35.)\n" +
                "\n" + "If endptr is not NULL, strtoul() stores the address of the first invalid character in *endptr. If there were no digits at all, strtoul() stores the original value of nptr in \\*endptr (and returns 0). In particular, if \\*nptr is not \\0 but \\*\\*endptr is \\0 on return, the entire string is valid.\n" +
                "\n" + "The strtoull() function works just like the strtoul() function but returns an unsigned long long int value.");
        systemName = ("system - execute a shell command");
        systemSynopsis = ("#include <stdlib.h>\n" + "int system(const char * command);\n");
        systemDescription = ("system() executes a command specified in command by calling /bin/sh -c command, and returns after the command has been completed. During execution of the command, SIGCHLD will be blocked, and SIGINT and SIGQUIT will be ignored.");
        wcstombsName = ("wcstombs - convert a wide-character string to a multibyte string");
        wcstombsSynopsis = ("#include <stdlib.h>\n" + "size_t wcstombs(char * dest, const wchar_t * src, size_t n);\n");
        wcstombsDescription = ("If dest is not a NULL pointer, the wcstombs() function converts the wide-character string src to a multibyte string starting at dest. At most n bytes are written to dest. The conversion starts in the initial state. The conversion can stop for three reasons:\n" +
                "\n" + "A wide character has been encountered that can not be represented as a multibyte sequence (according to the current locale). In this case (size_t) -1 is returned.\n" +
                "\n" + "The length limit forces a stop. In this case the number of bytes written to dest is returned, but the shift state at this point is lost.\n" +
                "\n" + "The wide-character string has been completely converted, including the terminating null wide character (L'\\0'). In this case the conversion ends in the initial state. The number of bytes written to dest, excluding the terminating null byte (\\0), is returned.\n" +
                "\n" + "The programmer must ensure that there is room for at least n bytes at dest.\n" +
                "\n" + "If dest is NULL, n is ignored, and the conversion proceeds as above, except that the converted bytes are not written out to memory, and that no length limit exists.\n" +
                "\n" + "In order to avoid the case 2 above, the programmer should make sure n is greater or equal to wcstombs(NULL,src,0)+1.");
        wctombName = ("wctomb - convert a wide character to a multibyte sequence");
        wctombSynopsis = ("#include <stdlib.h>\n" + "int wctomb(char * s, wchar_t wc);\n");
        wctombDescription = ("If s is not NULL, the wctomb() function converts the wide character wc to its multibyte representation and stores it at the beginning of the character array pointed to by s. It updates the shift state, which is stored in a static anonymous variable known only to the wctomb() function, and returns the length of said multibyte representation, that is, the number of bytes written at s.\n" +
                "\n" + "The programmer must ensure that there is room for at least *MB_CUR_MAX\\* bytes at s.\n" +
                "\n" + "If s is NULL, the wctomb() function resets the shift state, known only to this function, to the initial state, and returns nonzero if the encoding has nontrivial shift state, or zero if the encoding is stateless.");


        memchrName = ("memchr, memrchr, rawmemchr - scan memory for a character");
        memchrSynopsis = ("#include <string.h>\n" + "\n" + "void * memchr(const void * s, int c, size_t n);\n" + "\n" + "void * memrchr(const void * s, int c, size_t n);\n" + "\n" + "void * rawmemchr(const void * s, int c);\n");
        memchrDescription = ("he memchr() function scans the initial n bytes of the memory area pointed to by s for the first instance of c. Both c and the bytes of the memory area pointed to by s are interpreted as unsigned char.\n" +
                "\n" + "The memrchr() function is like the memchr() function, except that it searches backward from the end of the n bytes pointed to by s instead of forward from the beginning.\n" +
                "\n" + "The rawmemchr() function is similar to memchr(): it assumes (i.e., the programmer knows for certain) that an instance of c lies somewhere in the memory area starting at the location pointed to by s, and so performs an optimized search for c (i.e., no use of a count argument to limit the range of the search). If an instance of c is not found, the results are unpredictable. The following call is a fast means of locating a string’s terminating null byte: char \\*p = rawmemchr(s, '\\0');\n");
        memcmpName = ("memcmp - compare memory areas");
        memcmpSynopsis = ("#include <string.h>\n" + "int memcmp(const void * s1, const void * s2, size_t n);\n");
        memcmpDescription = ("The memcmp() function compares the first n bytes (each interpreted as unsigned char) of the memory areas s1 and s2.");
        memcpyName = ("memcpy - copy memory area");
        memcpySynopsis = ("#include <string.h>\n" + "void * memcpy(void * dest, const void * src, size_t n);\n");
        memcpyDescription = ("The memcpy() function copies n bytes from memory area src to memory area dest. The memory areas must not overlap. Use memmove(3) if the memory areas do overlap.");
        memmoveName = ("memmove - copy memory area");
        memmoveSynopsis = ("#include <string.h>\n" + "void * memmove(void * dest, const void * src, size_t n);\n");
        memmoveDescription = ("The memmove() function copies n bytes from memory area src to memory area dest. The memory areas may overlap: copying takes place as though the bytes in src are first copied into a temporary array that does not overlap src or dest, and the bytes are then copied from the temporary array to dest.");
        memsetName = ("memset - fill memory with a constant byte");
        memsetSynopsis = ("#include <string.h>\n" + "void * memset(void * s, int c, size_t n);\n");
        memsetDescription = ("The memset() function fills the first n bytes of the memory area pointed to by s with the constant byte c.");
        strcatName = ("strcat, strncat - concatenate two strings");
        strcatSynopsis = ("#include <string.h>\n" + "\n" + "char * strcat(char * dest, const char * src);\n" + "\n" + "char * strncat(char * dest, const char * src, size_t n);\n");
        strcatDescription = ("The strcat() function appends the src string to the dest string, overwriting the terminating null byte (\\0) at the end of dest, and then adds a terminating null byte. The strings may not overlap, and the dest string must have enough space for the result. If dest is not large enough, program behavior is unpredictable; buffer overruns are a favorite avenue for attacking secure programs.\n" +
                "\n" + "The strncat() function is similar, except that\n" + "\n" + "it will use at most n bytes from src; and\n" +
                "\n" + "src does not need to be null-terminated if it contains n or more bytes.\n" +
                "\n" + "As with strcat(), the resulting string in dest is always null-terminated.\n" +
                "\n" + "If src contains n or more bytes, strncat() writes n+1 bytes to dest (n from src plus the terminating null byte). Therefore, the size of dest must be at least strlen(dest)+n+1.");
        strchrName = ("strchr, strrchr, strchrnul - locate character in string");
        strchrSynopsis = ("#include <string.h>\n" + "\n" + "char * strchr(const char * s, int c);\n" + "\n" + "char * strrchr(const char * s, int c);\n");
        strchrDescription = ("The strchr() function returns a pointer to the first occurrence of the character c in the string s.\n" +
                "\n" + "The strrchr() function returns a pointer to the last occurrence of the character c in the string s.\n" +
                "\n" + "The strchrnul() function is like strchr() except that if c is not found in s, then it returns a pointer to the null byte at the end of s, rather than NULL.\n" +
                "\n" + "Here \"character\" means \"byte\"; these functions do not work with wide or multibyte characters.");
        strcmpName = ("strcmp - compare two strings");
        strcmpSynopsis = ("#include <string.h>\n" + "\n" + "int strcmp(const char * s1, const char * s2);\n" + "\n" + "int strncmp(const char * s1, const char * s2, size_t n);\n");
        strcmpDescription = ("The strcmp() function compares the two strings s1 and s2. It returns an integer less than, equal to, or greater than zero if s1 is found, respectively, to be less than, to match, or be greater than s2.\n" +
                "\n" + "The strncmp() function is similar, except it compares the only first (at most) n bytes of s1 and s2.");
        strcollName = ("strcoll - compare two strings using the current locale");
        strcollSynopsis = ("#include <string.h>\n" + "int strcoll(const char * s1, const char * s2);\n");
        strcollDescription = ("The strcoll() function compares the two strings s1 and s2. It returns an integer less than, equal to, or greater than zero if s1 is found, respectively, to be less than, to match, or be greater than s2. The comparison is based on strings interpreted as appropriate for the program’s current locale for category *LC_COLLATE\\*. (See setlocale(3).)");
        strcpyName = ("strcpy - copy a string");
        strcpySynopsis = ("#include <string.h>\n" + "\n" + "char * strcpy(char * dest, const char * src);\n" + "\n" + "char * strncpy(char * dest, const char * src, size_t n);\n");
        strcpyDescription = ("The strcpy() function copies the string pointed to by src, including the terminating null byte (\\0), to the buffer pointed to by dest. The strings may not overlap, and the destination string dest must be large enough to receive the copy. Beware of buffer overruns! (See BUGS.)\n" +
                "\n" + "The strncpy() function is similar, except that at most n bytes of src are copied. *Warning\\*: If there is no null byte among the first n bytes of src, the string placed in dest will not be null-terminated.\n" +
                "\n" + "If the length of src is less than n, strncpy() writes additional null bytes to dest to ensure that a total of n bytes are written.");
        strcspnName = ("strspn, strcspn - search a string for a set of bytes");
        strcspnSynopsis = ("#include <string.h>\n" + "\n" + "size_t strspn(const char * s, const char * accept);\n" + "\n" + "size_t strcspn(const char * s, const char * reject);\n");
        strcspnDescription = ("The strspn() function calculates the length (in bytes) of the initial segment of s which consists entirely of bytes in accept.\n" +
                "\n" + "The strcspn() function calculates the length of the initial segment of s which consists entirely of bytes not in reject.");
        strerrorName = ("strerror, strerror_r - return string describing error number");
        strerrorSynopsis = ("#include <string.h>\n" + "\n" + "char * strerror(int errnum);\n" + "\n" + "int strerror_r(int errnum, char * buf, size_t buflen);\n");
        strerrorDescription = ("The strerror() function returns a pointer to a string that describes the error code passed in the argument errnum, possibly using the LC_MESSAGES part of the current locale to select the appropriate language. (For example, if errnum is EINVAL, the returned description will \"Invalid argument\".) This string must not be modified by the application, but may be modified by a subsequent call to strerror(). No library function, including perror(3), will modify this string.\n" +
                "\n" + "The strerror_r() function is similar to strerror(), but is thread safe. This function is available in two versions: an XSI-compliant version specified in POSIX.1-2001 (available since glibc 2.3.4, but not POSIX-compliant until glibc 2.13), and a GNU-specific version (available since glibc 2.0). The XSI-compliant version is provided with the feature test macros settings shown in the SYNOPSIS; otherwise the GNU-specific version is provided. If no feature test macros are explicitly defined, then (since glibc 2.4) *_POSIX_SOURCE\\* is defined by default with the value 200112L, so that the XSI-compliant version of strerror_r() is provided by default.\n" +
                "\n" + "The XSI-compliant strerror_r() is preferred for portable applications. It returns the error string in the user-supplied buffer buf of length buflen.\n" +
                "\n" + "The GNU-specific strerror_r() returns a pointer to a string containing the error message. This may be either a pointer to a string that the function stores in buf, or a pointer to some (immutable) static string (in which case buf is unused). If the function stores a string in buf, then at most buflen bytes are stored (the string may be truncated if buflen is too small and errnum is unknown). The string always includes a terminating null byte.");
        strlenName = ("strlen - return length of a string");
        strlenSynopsis = ("#include <string.h>\n" + "size_t strlen(const char * s);\n");
        strlenDescription = ("The strlen() function calculates the length of the string s, excluding the terminating null byte (\\0).");
        strncatName = ("strcat, strncat - concatenate two strings");
        strncatSynopsis = ("#include <string.h>\n" + "\n" + "char * strcat(char * dest, const char * src);\n" + "\n" + "char * strncat(char * dest, const char * src, size_t n);\n");
        strncatDescription = ("The strcat() function appends the src string to the dest string, overwriting the terminating null byte (\\0) at the end of dest, and then adds a terminating null byte. The strings may not overlap, and the dest string must have enough space for the result. If dest is not large enough, program behavior is unpredictable; buffer overruns are a favorite avenue for attacking secure programs.\n" +
                "\n" + "The strncat() function is similar, except that\n" + "\n" + "it will use at most n bytes from src; and\n" +
                "\n" + "src does not need to be null-terminated if it contains n or more bytes.\n" +
                "\n" + "As with strcat(), the resulting string in dest is always null-terminated.\n" +
                "\n" + "If src contains n or more bytes, strncat() writes n+1 bytes to dest (n from src plus the terminating null byte). Therefore, the size of dest must be at least strlen(dest)+n+1.");
        strncmpName = ("strcmp, strncmp - compare two strings");
        strncmpSynopsis = ("#include <string.h>\n" + "\n" + "int strcmp(const char * s1, const char * s2);\n" + "\n" + "int strncmp(const char * s1, const char * s2, size_t n);\n");
        strncmpDescription = ("The strcmp() function compares the two strings s1 and s2. It returns an integer less than, equal to, or greater than zero if s1 is found, respectively, to be less than, to match, or be greater than s2.\n" +
                "\n" + "The strncmp() function is similar, except it compares the only first (at most) n bytes of s1 and s2.");
        strncpyName = ("strcpy, strncpy - copy a string");
        strncpySynopsis = ("#include <string.h>\n" + "\n" + "char * strcpy(char * dest, const char * src);\n" + "\n" + "char * strncpy(char * dest, const char * src, size_t n);\n");
        strncpyDescription = ("The strcpy() function copies the string pointed to by src, including the terminating null byte (\\0), to the buffer pointed to by dest. The strings may not overlap, and the destination string dest must be large enough to receive the copy. Beware of buffer overruns! (See BUGS.)\n" +
                "\n" + "The strncpy() function is similar, except that at most n bytes of src are copied. *Warning\\*: If there is no null byte among the first n bytes of src, the string placed in dest will not be null-terminated.\n" +
                "\n" + "If the length of src is less than n, strncpy() writes additional null bytes to dest to ensure that a total of n bytes are written.");
        strpbrkName = ("strpbrk - search a string for any of a set of bytes");
        strpbrkSynopsis = ("#include <string.h>\n" + "char * strpbrk(const char * s, const char * accept);\n");
        strpbrkDescription = ("The strpbrk() function locates the first occurrence in the string s of any of the bytes in the string accept.");
        strrchrName = ("strchr, strrchr, strchrnul - locate character in string");
        strrchrSynopsis = ("#include <string.h>\n" + "\n" + "char * strchr(const char * s, int c);\n" + "\n" + "char * strrchr(const char * s, int c);\n");
        strrchrDescription = ("The strchr() function returns a pointer to the first occurrence of the character c in the string s.\n" +
                "\n" + "The strrchr() function returns a pointer to the last occurrence of the character c in the string s.\n" +
                "\n" + "The strchrnul() function is like strchr() except that if c is not found in s, then it returns a pointer to the null byte at the end of s, rather than NULL.\n" +
                "\n" + "Here \"character\" means \"byte\"; these functions do not work with wide or multibyte characters.");
        strspnName = ("strspn, strcspn - search a string for a set of bytes");
        strspnSynopsis = ("#include <string.h>\n" + "\n" + "size_t strspn(const char * s, const char * accept);\n" + "\n" + "size_t strcspn(const char * s, const char * reject);\n");
        strspnDescription = ("The strspn() function calculates the length (in bytes) of the initial segment of s which consists entirely of bytes in accept.\n" +
                "\n" + "The strcspn() function calculates the length of the initial segment of s which consists entirely of bytes not in reject.");
        strstrName = ("strstr, strcasestr - locate a substring");
        strstrSynopsis = ("#include <string.h>\n" + "char * strstr(const char * haystack, const char * needle);\n");
        strstrDescription = ("The strstr() function finds the first occurrence of the substring needle in the string haystack. The terminating null bytes (\\0) are not compared.\n" +
                "\n" + "The strcasestr() function is like strstr(), but ignores the case of both arguments.");
        strtokName = ("strtok, strtok_r - extract tokens from strings");
        strtokSynopsis = ("#include <string.h>\n" + "char * strtok(char * str, const char * delim);\n" + "\n" + "char * strtok_r(char * str, const char * delim, char ** saveptr);\n");
        strtokDescription = ("The strtok() function parses a string into a sequence of tokens. On the first call to strtok() the string to be parsed should be specified in str. In each subsequent call that should parse the same string, str should be NULL.\n" +
                "\n" + "The delim argument specifies a set of bytes that delimit the tokens in the parsed string. The caller may specify different strings in delim in successive calls that parse the same string.\n" +
                "\n" + "Each call to strtok() returns a pointer to a null-terminated string containing the next token. This string does not include the delimiting byte. If no more tokens are found, strtok() returns NULL.\n" +
                "\n" + "A sequence of two or more contiguous delimiter bytes in the parsed string is considered to be a single delimiter. Delimiter bytes at the start or end of the string are ignored. Put another way: the tokens returned by strtok() are always nonempty strings.\n" +
                "\n" + "The strtok_r() function is a reentrant version strtok(). The saveptr argument is a pointer to a char \\* variable that is used internally by strtok_r() in order to maintain context between successive calls that parse the same string.\n" +
                "\n" + "On the first call to strtok_r(), str should point to the string to be parsed, and the value of saveptr is ignored. In subsequent calls, str should be NULL, and saveptr should be unchanged since the previous call.\n" +
                "\n" + "Different strings may be parsed concurrently using sequences of calls to strtok_r() that specify different saveptr arguments.");
        strxfrmName = ("strxfrm - string transformation");
        strxfrmSynopsis = ("#include <string.h>\n" + "size_t strxfrm(char * dest, const char * src, size_t n);\n");
        strxfrmDescription = ("The strxfrm() function transforms the src string into a form such that the result of strcmp(3) on two strings that have been transformed with strxfrm() is the same as the result of strcoll(3) on the two strings before their transformation. The first n bytes of the transformed string are placed in dest. The transformation is based on the program’s current locale for category *LC_COLLATE\\*. (See setlocale(3)).");
        asctimeName = ("asctime, ctime, gmtime, localtime, mktime, asctime_r, ctime_r, gmtime_r, localtime_r - transform date and time to broken-down time or ASCII");
        asctimeSynopsis = ("#include <time.h>\n" + "\n" + "char * asctime(const struct tm * tm);\n" + "\n" + "char * asctime_r(const struct tm * tm, char * buf);\n" + "\n" + "char * ctime(const time_t * timep);\n" + "\n" + "char * ctime_r(const time_t * timep, char * buf);\n" + "\n" + "struct  *gmtime tm(const time_t * timep);\n" + "\n" + "struct  *gmtime_r tm(const time_t * timep, struct tm * result);\n" + "\n" + "struct  *localtime tm(const time_t * timep);\n" + "\n" + "struct  *localtime_r tm(const time_t * timep, struct tm * result);\n" + "\n" + "time_t mktime(struct tm * tm);\n");
        asctimeDescription = ("The asctime() function converts the broken-down time value tm into a null-terminated string with the same format as ctime(). The return value points to a statically allocated string which might be overwritten by subsequent calls to any of the date and time functions. The asctime_r() function does the same, but stores the string in a user-supplied buffer which should have room for at least 26 bytes.");
        clockName = ("clock - determine processor time");
        clockSynopsis = ("#include <time.h>\n" + "clock_t clock(void);\n");
        clockDescription = ("The clock() function returns an approximation of processor time used by the program.");
        ctimeName = ("asctime, ctime, gmtime, localtime, mktime, asctime_r, ctime_r, gmtime_r, localtime_r - transform date and time to broken-down time or ASCII");
        ctimeSynopsis = ("#include <time.h>\n" + "\n" + "char * asctime(const struct tm * tm);\n" + "\n" + "char * asctime_r(const struct tm * tm, char * buf);\n" + "\n" + "char * ctime(const time_t * timep);\n" + "\n" + "char * ctime_r(const time_t * timep, char * buf);\n" + "\n" + "struct  *gmtime tm(const time_t * timep);\n" + "\n" + "struct  *gmtime_r tm(const time_t * timep, struct tm * result);\n" + "\n" + "struct  *localtime tm(const time_t * timep);\n" + "\n" + "struct  *localtime_r tm(const time_t * timep, struct tm * result);\n" + "\n" + "time_t mktime(struct tm * tm);\n");
        ctimeDescription = ("The ctime(), *gmtime\\*() and *localtime\\*() functions all take an argument of data type time_t which represents calendar time. When interpreted as an absolute time value, it represents the number of seconds elapsed since the Epoch, 1970-01-01 00:00:00 +0000 (UTC).\n" +
                "\n" + "The asctime() and mktime() functions both take an argument representing broken-down time which is a representation separated into year, month, day, and so on.\n" +
                "\n" + "The call *ctime(\\*t\\*)\\* is equivalent to *asctime(localtime(\\*t\\*))\\*. It converts the calendar time t into a null-terminated string of the form\n" +
                "\n" + "Wed Jun 30 21:49:08 1993");
        difftimeName = ("difftime - calculate time difference");
        difftimeSynopsis = ("#include <time.h>\n" + "double difftime(time_t time1, time_t time0);\n");
        difftimeDescription = ("The difftime() function returns the number of seconds elapsed between time time1 and time time0, represented as a double. Each of the times is specified in calendar time, which means its value is a measurement (in seconds) relative to the Epoch, 1970-01-01 00:00:00 +0000 (UTC).");
        gmtimeName = ("asctime, ctime, gmtime, localtime, mktime, asctime_r, ctime_r, gmtime_r, localtime_r - transform date and time to broken-down time or ASCII");
        gmtimeSynopsis = ("#include <time.h>\n" + "\n" + "char * asctime(const struct tm * tm);\n" + "\n" + "char * asctime_r(const struct tm * tm, char * buf);\n" + "\n" + "char * ctime(const time_t * timep);\n" + "\n" + "char * ctime_r(const time_t * timep, char * buf);\n" + "\n" + "struct  *gmtime tm(const time_t * timep);\n" + "\n" + "struct  *gmtime_r tm(const time_t * timep, struct tm * result);\n" + "\n" + "struct  *localtime tm(const time_t * timep);\n" + "\n" + "struct  *localtime_r tm(const time_t * timep, struct tm * result);\n" + "\n" + "time_t mktime(struct tm * tm);\n");
        gmtimeDescription = ("The *gmtime\\*() function converts the calendar time timep to broken-down time representation, expressed in Coordinated Universal Time (UTC). It may return NULL when the year does not fit into an integer. The return value points to a statically allocated struct which might be overwritten by subsequent calls to any of the date and time functions. The *gmtime_r\\*() function does the same, but stores the data in a user-supplied struct.");
        localtimeName = ("asctime, ctime, gmtime, localtime, mktime, asctime_r, ctime_r, gmtime_r, localtime_r - transform date and time to broken-down time or ASCII");
        localtimeSynopsis = ("#include <time.h>\n" + "\n" + "char * asctime(const struct tm * tm);\n" + "\n" + "char * asctime_r(const struct tm * tm, char * buf);\n" + "\n" + "char * ctime(const time_t * timep);\n" + "\n" + "char * ctime_r(const time_t * timep, char * buf);\n" + "\n" + "struct  *gmtime tm(const time_t * timep);\n" + "\n" + "struct  *gmtime_r tm(const time_t * timep, struct tm * result);\n" + "\n" + "struct  *localtime tm(const time_t * timep);\n" + "\n" + "struct  *localtime_r tm(const time_t * timep, struct tm * result);\n" + "\n" + "time_t mktime(struct tm * tm);\n");
        localtimeDescription = ("The *localtime\\*() function converts the calendar time timep to broken-down time representation, expressed relative to the user’s specified timezone. The function acts as if it called tzset(3) and sets the external variables tzname with information about the current timezone, timezone with the difference between Coordinated Universal Time (UTC) and local standard time in seconds, and daylight to a nonzero value if daylight savings time rules apply during some part of the year. The return value points to a statically allocated struct which might be overwritten by subsequent calls to any of the date and time functions. The *localtime_r\\*() function does the same, but stores the data in a user-supplied struct. It need not set tzname, timezone, and daylight.");
        mktimeName = ("asctime, ctime, gmtime, localtime, mktime, asctime_r, ctime_r, gmtime_r, localtime_r - transform date and time to broken-down time or ASCII");
        mktimeSynopsis = ("#include <time.h>\n" + "\n" + "char * asctime(const struct tm * tm);\n" + "\n" + "char * asctime_r(const struct tm * tm, char * buf);\n" + "\n" + "char * ctime(const time_t * timep);\n" + "\n" + "char * ctime_r(const time_t * timep, char * buf);\n" + "\n" + "struct  *gmtime tm(const time_t * timep);\n" + "\n" + "struct  *gmtime_r tm(const time_t * timep, struct tm * result);\n" + "\n" + "struct  *localtime tm(const time_t * timep);\n" + "\n" + "struct  *localtime_r tm(const time_t * timep, struct tm * result);\n" + "\n" + "time_t mktime(struct tm * tm);\n");
        mktimeDescription = ("The mktime() function converts a broken-down time structure, expressed as local time, to calendar time representation. The function ignores the values supplied by the caller in the tm_wday and tm_yday fields. The value specified in the tm_isdst field informs mktime() whether or not daylight saving time (DST) is in effect for the time supplied in the tm structure: a positive value means DST is in effect; zero means that DST is not in effect; and a negative value means that mktime() should (use timezone information and system databases to) attempt to determine whether DST is in effect at the specified time.");
        strftimeName = ("strftime - format date and time");
        strftimeSynopsis = ("#include <time.h>\n" + "size_t strftime(char * s, size_t max, const char * format, const struct tm * tm);\n");
        strftimeDescription = ("The strftime() function formats the broken-down time tm according to the format specification format and places the result in the character array s of size max.\n" +
                "\n" + "The format specification is a null-terminated string and may contain special character sequences called conversion specifications, each of which is introduced by a % character and terminated by some other character known as a conversion specifier character. All other character sequences are ordinary character sequences.");
        timeName = ("time - get time");
        timeSynopsis = ("#include <time.h>\n" + "time_t time(time_t * tloc);\n");
        timeDescription = ("The time() function shall return the value of time in seconds since the Epoch.\n" +
                "\n" + "The tloc argument points to an area where the return value is also stored. If tloc is a null pointer, no value is stored.");
    }
}
