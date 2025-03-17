package command.com.network;

import command.chandan.Command;

public class SendPostRequestCommand implements Command {
    private NetworkService networkService ;
    private String url;
    private String data;

    public SendPostRequestCommand(NetworkService networkService, String url, String data) {
        this.networkService = networkService;
        this.url = url;
        this.data = data;
    }

    @Override
    public void execute() {
        networkService.sendPostRequest(url,data);
    }
}
