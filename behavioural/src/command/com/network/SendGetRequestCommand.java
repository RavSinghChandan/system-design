package command.com.network;

public class SendGetRequestCommand implements NetworkCommand{
    private NetworkService networkService;
    private  String url;

    public SendGetRequestCommand(NetworkService networkService,String url) {
        this.networkService = networkService;
        this.url = url;
    }

    @Override
    public void execute() {
        networkService.sendGetRequest(url);
    }
}
