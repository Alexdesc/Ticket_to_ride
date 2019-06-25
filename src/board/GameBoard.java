package board;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

import cardsDeck.Deck;

public class GameBoard {

	public Deck AllCards;
	
	Node nodeEdinburgh = new Node("Edinburgh");
	Node nodeLondon = new Node("London");
	Node nodeAmsterdam = new Node("Amsterdam");
	Node nodeDieppe = new Node("Dieppe");
	Node nodeBrest = new Node("Brest");
	Node nodeParis = new Node("Paris");
	Node nodePamplona = new Node("Pamplona");
	Node nodeMadrid = new Node("Madrid");
	Node nodeLisboa = new Node("Lisboa");
	Node nodeCadiz = new Node("Cadiz");
	Node nodeMarseille = new Node("Marseille");
	Node nodeZurich = new Node("Zurich");
	Node nodeBruxelles = new Node("Bruxelles");
	Node nodeRoma = new Node("Roma");
	Node nodePalermo = new Node("Palermo");
	Node nodeBrindish = new Node("Brindish");
	Node nodeVenezia = new Node("Venezia");
	Node nodeEssen = new Node("Essen");
	Node nodeFrankfurt = new Node("Frankfurt");
	Node nodeMunchen = new Node("Munchen");
	Node nodeWien = new Node("Wien");
	Node nodeBerlin = new Node("Berlin");
	Node nodeKobenhavn = new Node("Kobenhavn");
	Node nodeStockholm = new Node("Stokholm");
	Node nodePetrograd = new Node("Petrograde");
	Node nodeRiga = new Node("Riga");
	Node nodeDanzig = new Node("Danzig");
	Node nodeWarszawa = new Node("Warszawa");
	Node nodeWilno = new Node("Wilno");
	Node nodeKyiv = new Node("Kyiv");
	Node nodeSmolensk = new Node("Smolensk");
	Node nodeMoskva = new Node("Moskva");
	Node nodeZagrab = new Node("Zagrab");
	Node nodeSarajevo = new Node("Sarajevo");
	Node nodeSofia = new Node("Sofia");
	Node nodeAthina = new Node("Athina");
	Node nodeSmyrna = new Node("Smyrna");
	Node nodeAngora = new Node("Angora");
	Node nodeConstantinople = new Node("Constantinople");
	Node nodeErzurum = new Node("Erzurum");
	Node nodeSochi = new Node("Sochi");
	Node nodeSevastopol = new Node("Sevastopol");
	Node nodeRostov = new Node("Rostov");
	Node nodeBucuresti = new Node("Bucuresti");
	Node nodeKharkov = new Node("Kharkov");
	Node nodeBarcelona = new Node("Barcelona");
	Node nodeBudapest = new Node("Budapest");
	
	Graph mapDest = new Graph();

	public GameBoard(){

		AllCards = new Deck();
		AllCards.initPrimaryDestCard();
		AllCards.initWagonDeck();
		AllCards.initAllDest();

	}
	
	public void creatNodeGraph(){
		nodeEdinburgh.addDestination(nodeLondon,4);
		nodeEdinburgh.addDestination(nodeLondon,4);
		
		nodeLondon.addDestination(nodeDieppe, 2);
		nodeLondon.addDestination(nodeAmsterdam, 2);
		
		nodeDieppe.addDestination(nodeLondon, 2);
		nodeDieppe.addDestination(nodeBrest, 2);
		nodeDieppe.addDestination(nodeParis, 1);
		nodeDieppe.addDestination(nodeBruxelles, 2);
		
		nodeBrest.addDestination(nodePamplona, 4);
		nodeBrest.addDestination(nodeParis, 3);
		
		nodeParis.addDestination(nodePamplona, 4);
		nodeParis.addDestination(nodeMarseille, 4);
		nodeParis.addDestination(nodeBruxelles, 2);
		nodeParis.addDestination(nodeFrankfurt, 3);
		nodeParis.addDestination(nodeZurich, 3);
		
		nodePamplona.addDestination(nodeMadrid, 3);
		nodePamplona.addDestination(nodeMadrid, 3);
		nodePamplona.addDestination(nodeParis, 4);
		nodePamplona.addDestination(nodeMarseille, 4);
		
		nodeMadrid.addDestination(nodeLisboa, 3);
		nodeLisboa.addDestination(nodeCadiz, 2);
		nodeCadiz.addDestination(nodeMadrid, 3);
		nodeMadrid.addDestination(nodeBarcelona, 2);
		
		nodeBarcelona.addDestination(nodePamplona, 2);
		nodeBarcelona.addDestination(nodeMarseille, 4);
		
		nodeMarseille.addDestination(nodeZurich, 2);
		nodeMarseille.addDestination(nodeRoma, 4);
		
		nodeZurich.addDestination(nodeMunchen, 2);
		nodeZurich.addDestination(nodeVenezia, 2);
		
		nodeBruxelles.addDestination(nodeFrankfurt, 2);
		nodeBruxelles.addDestination(nodeAmsterdam, 1);
		nodeBruxelles.addDestination(nodeParis, 2);
		
		nodeFrankfurt.addDestination(nodeParis, 3);
		nodeFrankfurt.addDestination(nodeEssen, 2);
		nodeFrankfurt.addDestination(nodeMunchen, 2);
		nodeFrankfurt.addDestination(nodeBerlin, 3);
		
		nodeBerlin.addDestination(nodeFrankfurt, 3);
		nodeBerlin.addDestination(nodeEssen, 2);
		nodeBerlin.addDestination(nodeDanzig, 4);
		nodeBerlin.addDestination(nodeWien, 3);
		nodeBerlin.addDestination(nodeWarszawa, 4);
		
		nodeEssen.addDestination(nodeAmsterdam, 3);
		nodeEssen.addDestination(nodeKobenhavn, 3);
		
		nodeKobenhavn.addDestination(nodeEssen, 3);
		nodeKobenhavn.addDestination(nodeStockholm, 3);
		
		nodeStockholm.addDestination(nodeKobenhavn, 3);
		nodeStockholm.addDestination(nodePetrograd, 8);
		
		nodePetrograd.addDestination(nodeRiga, 4);
		nodePetrograd.addDestination(nodeWilno, 4);
		nodePetrograd.addDestination(nodeMoskva, 4);
		
		nodeRiga.addDestination(nodeDanzig, 3);
		nodeRiga.addDestination(nodeWilno, 4);
		
		nodeDanzig.addDestination(nodeWarszawa, 2);
		
		nodeWarszawa.addDestination(nodeBerlin, 4);
		nodeWarszawa.addDestination(nodeWilno, 3);
		nodeWarszawa.addDestination(nodeWien, 4);
		nodeWarszawa.addDestination(nodeKyiv, 4);
		
		nodeSmolensk.addDestination(nodeWilno, 3);
		nodeSmolensk.addDestination(nodeMoskva, 2);
		nodeSmolensk.addDestination(nodeKyiv, 3);
		
		nodeKharkov.addDestination(nodeMoskva, 4);
		nodeKharkov.addDestination(nodeRostov, 2);
		nodeKharkov.addDestination(nodeKyiv, 4);
		
		nodeBudapest.addDestination(nodeWien, 1);
		nodeBudapest.addDestination(nodeWien, 1);
		nodeBudapest.addDestination(nodeZagrab, 2);
		nodeBudapest.addDestination(nodeKyiv, 6);
		nodeBudapest.addDestination(nodeBucuresti, 4);
		nodeBudapest.addDestination(nodeSarajevo, 3);
		
		nodeBucuresti.addDestination(nodeKyiv, 4);
		nodeBucuresti.addDestination(nodeSevastopol, 4);
		nodeBucuresti.addDestination(nodeConstantinople, 3);
		nodeBucuresti.addDestination(nodeSofia, 2);
		
		nodeSevastopol.addDestination(nodeRostov, 4);
		nodeSevastopol.addDestination(nodeConstantinople, 4);
		nodeSevastopol.addDestination(nodeErzurum, 4);
		nodeSevastopol.addDestination(nodeSochi, 2);
		
		nodeSochi.addDestination(nodeRostov, 2);
		nodeSochi.addDestination(nodeErzurum, 3);
		
		nodeErzurum.addDestination(nodeAngora, 3);
		nodeAngora.addDestination(nodeSmyrna, 3);
		
		nodeConstantinople.addDestination(nodeAngora, 2);
		nodeConstantinople.addDestination(nodeSmyrna, 2);
		nodeConstantinople.addDestination(nodeSofia, 3);
		
		nodePalermo.addDestination(nodeSmyrna, 6);
		nodePalermo.addDestination(nodeRoma, 4);
		
		nodeBrindish.addDestination(nodePalermo, 3);
		nodeBrindish.addDestination(nodeRoma, 2);
		nodeBrindish.addDestination(nodeAthina, 4);
		
		nodeVenezia.addDestination(nodeZagrab, 2);
		nodeVenezia.addDestination(nodeMunchen, 2);
		nodeVenezia.addDestination(nodeRoma, 2);
		
		nodeSarajevo.addDestination(nodeSofia, 2);
		nodeSarajevo.addDestination(nodeZagrab, 3);
		nodeSarajevo.addDestination(nodeAthina, 4);
		
		nodeAthina.addDestination(nodeSofia, 3);
		nodeAthina.addDestination(nodeSmyrna, 2);
		
		mapDest.addNode(nodeAmsterdam);
		mapDest.addNode(nodeAngora);
		mapDest.addNode(nodeAthina);
		mapDest.addNode(nodeBarcelona);
		mapDest.addNode(nodeBerlin);
		mapDest.addNode(nodeBrest);
		mapDest.addNode(nodeBrindish);
		mapDest.addNode(nodeBruxelles);
		mapDest.addNode(nodeBucuresti);
		mapDest.addNode(nodeBudapest);
		mapDest.addNode(nodeCadiz);
		mapDest.addNode(nodeConstantinople);
		mapDest.addNode(nodeDanzig);
		mapDest.addNode(nodeDieppe);
		mapDest.addNode(nodeEdinburgh);
		mapDest.addNode(nodeErzurum);
		mapDest.addNode(nodeEssen);
		mapDest.addNode(nodeFrankfurt);
		mapDest.addNode(nodeKharkov);
		mapDest.addNode(nodeKobenhavn);
		mapDest.addNode(nodeKyiv);
		mapDest.addNode(nodeLisboa);
		mapDest.addNode(nodeLondon);
		mapDest.addNode(nodeMadrid);
		mapDest.addNode(nodeMarseille);
		mapDest.addNode(nodeMoskva);
		mapDest.addNode(nodeMunchen);
		mapDest.addNode(nodePalermo);
		mapDest.addNode(nodePamplona);
		mapDest.addNode(nodeParis);
		mapDest.addNode(nodePetrograd);
		mapDest.addNode(nodeRiga);
		mapDest.addNode(nodeRoma);
		mapDest.addNode(nodeRostov);
		mapDest.addNode(nodeSarajevo);
		mapDest.addNode(nodeSevastopol);
		mapDest.addNode(nodeSmolensk);
		mapDest.addNode(nodeSmyrna);
		mapDest.addNode(nodeSochi);
		mapDest.addNode(nodeSofia);
		mapDest.addNode(nodeStockholm);
		mapDest.addNode(nodeVenezia);
		mapDest.addNode(nodeWarszawa);
		mapDest.addNode(nodeWien);
		mapDest.addNode(nodeWilno);
		mapDest.addNode(nodeZagrab);
		mapDest.addNode(nodeZurich);
		
	}

	private static Node getLowestDistanceNode(Set < Node > unsettledNodes) {
		Node lowestDistanceNode = null;
		int lowestDistance = Integer.MAX_VALUE;
		for (Node node: unsettledNodes) {
			int nodeDistance = node.getDistance();
			if (nodeDistance < lowestDistance) {
				lowestDistance = nodeDistance;
				lowestDistanceNode = node;
			}
		}
		return lowestDistanceNode;
	}

	private static void CalculateMinimumDistance(Node evaluationNode,Integer edgeWeigh, Node sourceNode) {
		Integer sourceDistance = sourceNode.getDistance();
		if (sourceDistance + edgeWeigh < evaluationNode.getDistance()) {
			evaluationNode.setDistance(sourceDistance + edgeWeigh);
			LinkedList<Node> shortestPath = new LinkedList<>(sourceNode.getShortestPath());
			shortestPath.add(sourceNode);
			evaluationNode.setShortestPath(shortestPath);
		}
	}

	public static Graph calculateShortestPathFromSource(Graph graph, Node source) {
		source.setDistance(0);

		Set<Node> settledNodes = new HashSet<>();
		Set<Node> unsettledNodes = new HashSet<>();

		unsettledNodes.add(source);

		while (unsettledNodes.size() != 0) {
			Node currentNode = getLowestDistanceNode(unsettledNodes);
			unsettledNodes.remove(currentNode);
			for (Entry < Node, Integer> adjacencyPair: 
				currentNode.getAdjacentNodes().entrySet()) {
				Node adjacentNode = adjacencyPair.getKey();
				Integer edgeWeight = adjacencyPair.getValue();
				if (!settledNodes.contains(adjacentNode)) {
					CalculateMinimumDistance(adjacentNode, edgeWeight, currentNode);
					unsettledNodes.add(adjacentNode);
				}
			}
			settledNodes.add(currentNode);
		}
		return graph;
	}
	
	public Deck getDeck(){
		return this.AllCards;
	}

}
