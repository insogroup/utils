package insogroup.utils.utils.FilesDownloader.interfaces;

public interface DownloadEventListener {
    void downloadComplete(String url, String resultPath);
    void downloadFail(String url, String message);
}
