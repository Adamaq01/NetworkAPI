package fr.adamaq01.networkapi.example;

import fr.adamaq01.networkapi.client.Client;
import fr.adamaq01.networkapi.objects.HostInfos;
import fr.adamaq01.networkapi.packets.Packet;
import fr.adamaq01.networkapi.packets.TextPacket;

/**
 * Created by Adamaq01 on 25/02/2017.
 */
public class TestClient extends Client {

    public static void main(String[] args) {
        TestClient client = new TestClient();
        client.connect();
        client.sendPacket(new TextPacket("WOUHOU!"));
    }

    public TestClient() {
        super("TestClient", new HostInfos("localhost", 9063), 4);
    }

    @Override
    public void onPacketReceive(Packet packet) {
        System.out.println(packet.toString());
        disconnect();
    }
}
