from fastapi import FastAPI
import uvicorn

from mylib.logic import search_wiki, phrase as wikiphrase, wiki as wikilogic

app = FastAPI()


@app.get("/")
async def root():
    return {"message": "Wikipedia API. Call /search or /wiki"}


@app.get("/search/{value}")
async def search(value: str):
    """Search something in WikiPedia"""
    res = search_wiki(value)
    return {"result": res}


@app.get("/wiki/{name}")
async def wiki(name: str):
    """Fetch something from WikiPedia"""
    res = wikilogic(name)
    return {"result": res}


@app.get("/phrase/{name}")
async def phrase(name: str):
    """Convert wiki result text to textblob"""
    res = wikiphrase(name)
    return {"result": res}


if __name__ == "__main__":
    uvicorn.run(app, host="0.0.0.0", port=8080)
